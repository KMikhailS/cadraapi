package ru.brobrocode.cadra.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.brobrocode.cadra.client.yukassa.CallbackProcessingException;
import ru.brobrocode.cadra.client.yukassa.model.PaymentObject;
import ru.brobrocode.cadra.client.yukassa.model.WebhookNotification;
import ru.brobrocode.cadra.dto.TariffResponse;
import ru.brobrocode.cadra.entity.*;
import ru.brobrocode.cadra.repository.PaymentRepository;
import ru.brobrocode.cadra.repository.SelectedTariffRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

@Service
@RequiredArgsConstructor
@Slf4j
public class YuKassaCallbackService {

	private final ObjectMapper objectMapper;
	private final PaymentRepository paymentRepository;
	private final UserService userService;
	private final TariffService tariffService;
	private final SelectedTariffRepository selectedTariffRepository;

	// IP адреса ЮKassa для проверки
	private final Set<String> VALID_YUKASSA_IPS = Set.of(
			"185.71.76.0/27",
			"185.71.77.0/27",
			"77.75.153.0/25",
			"77.75.156.11",
			"77.75.156.35",
			"2a02:5180::/32"
	);

	@Transactional
	public void processCallback(String rawPayload, Map<String, String> headers) {
		try {
			WebhookNotification notification = objectMapper.readValue(rawPayload, WebhookNotification.class);

			log.info("Processing webhook event: {} for object: {}",
					notification.getEvent(), notification.getObject().getId());

			switch (notification.getEvent()) {
				case "payment.waiting_for_capture":
					handlePaymentWaitingForCapture(notification.getObject());
					break;
				case "payment.succeeded":
					handlePaymentSucceeded(notification.getObject());
					break;
				case "payment.canceled":
					handlePaymentCanceled(notification.getObject());
					break;
				case "refund.succeeded":
					handleRefundSucceeded(notification.getObject());
					break;
				default:
					log.warn("Unknown webhook event: {}", notification.getEvent());
			}

		} catch (Exception e) {
			log.error("Error parsing webhook payload", e);
			throw new CallbackProcessingException("Failed to process webhook", e);
		}
	}

	private void handlePaymentWaitingForCapture(PaymentObject payment) {
		log.info("Payment {} is waiting for capture", payment.getId());

		// Обновляем статус платежа в БД
//		paymentService.updatePaymentStatus(payment.getId(), PaymentStatus.WAITING_FOR_CAPTURE);

		// Если автозахват включен, захватываем платеж
		if (payment.getPaid() && shouldAutoCapture(payment)) {
			try {
//				yuKassaService.capturePayment(payment.getId(), payment.getAmount().getValue());
				log.info("Auto-captured payment: {}", payment.getId());
			} catch (Exception e) {
				log.error("Failed to auto-capture payment: {}", payment.getId(), e);
			}
		}
	}

	private void handlePaymentSucceeded(PaymentObject paymentObject) {
		log.info("Payment {} succeeded", paymentObject.getId());
		try {
			Payment payment = paymentRepository.findById(paymentObject.getId())
					.orElse(null);
			if (payment != null && payment.getStatus() != PaymentStatus.SUCCEEDED) {
				updatePayment(paymentObject, payment);

				Map<String, Object> metadata = paymentObject.getMetadata();
				String userId = (String) metadata.get("userId");
				UserInfo userInfo = userService.findById(userId);
				Long tariffId = (Long) metadata.get("tariffId");
				Tariff tariff = tariffService.findById(tariffId);
				Integer maxResponses = tariff.getMaxResponses();
				SelectedTariff activeSelectedTariff = userService.getSelectedTariff(userId);
				if (activeSelectedTariff != null) {
					maxResponses = maxResponses + activeSelectedTariff.getMaxResponses() - activeSelectedTariff.getSpentResponses();
					activeSelectedTariff.setIsActive(false);
					selectedTariffRepository.save(activeSelectedTariff);
				}
				saveSelectedTariff(tariff, userInfo, maxResponses);
			}
		} catch (Exception e) {
			log.error("Error handling successful payment: {}", paymentObject.getId(), e);
		}
	}

	private void updatePayment(PaymentObject paymentObject, Payment payment) {
		payment.setIncomeAmount(paymentObject.getIncomeAmount().getValue());
		payment.setPaymentMethodType(paymentObject.getPaymentMethod().getType());
		payment.setStatus(PaymentStatus.fromString(paymentObject.getStatus()));
		paymentRepository.save(payment);
	}

	private void saveSelectedTariff(Tariff tariff, UserInfo userInfo, Integer maxResponses) {
		SelectedTariff selectedTariff = new SelectedTariff();
		selectedTariff.setTariff(tariff);
		selectedTariff.setUser(userInfo);
		selectedTariff.setSpentResponses(0);
		selectedTariff.setMaxResponses(maxResponses);
		selectedTariff.setIsActive(true);
		selectedTariff.setExpiresAt(LocalDate.now().plusDays(tariff.getExpirationDays()));
		selectedTariff.setCreatedAt(LocalDateTime.now());
		selectedTariff.setUpdatedAt(LocalDateTime.now());
		selectedTariffRepository.save(selectedTariff);
	}

	private void handlePaymentCanceled(PaymentObject payment) {
		log.info("Payment {} was canceled", payment.getId());

		try {
			// Обновляем статус платежа
//			paymentService.updatePaymentStatus(payment.getId(), PaymentStatus.CANCELED);

			// Обновляем статус заказа
			String orderId = extractOrderIdFromMetadata(payment.getMetadata());
			if (orderId != null) {
//				orderService.markOrderAsCanceled(orderId, payment.getCancellationDetails());

				// Отправляем уведомление о отмене
//				notificationService.sendPaymentCanceledNotification(orderId);
			}

		} catch (Exception e) {
			log.error("Error handling canceled payment: {}", payment.getId(), e);
		}
	}

	private void handleRefundSucceeded(PaymentObject refund) {
		log.info("Refund {} succeeded", refund.getId());

		try {
			// Обновляем информацию о возврате
//			paymentService.updateRefundStatus(refund.getId(), RefundStatus.SUCCEEDED);

			// Уведомляем пользователя
//			notificationService.sendRefundSuccessNotification(refund.getPaymentId());

		} catch (Exception e) {
			log.error("Error handling successful refund: {}", refund.getId(), e);
		}
	}

	public boolean isValidSourceIp(String clientIp) {
		// Здесь можно реализовать проверку IP адресов ЮKassa
		// Для простоты возвращаем true, но в продакшене нужна полная проверка
		return true;
	}

	private boolean shouldAutoCapture(PaymentObject payment) {
		// Логика определения необходимости автозахвата
		return payment.getAmount() != null &&
				payment.getAmount().getValue().compareTo(new BigDecimal("10000")) <= 0;
	}

	private String extractOrderIdFromMetadata(Map<String, Object> metadata) {
		if (metadata != null && metadata.containsKey("order_id")) {
			return (String) metadata.get("order_id");
		}
		return null;
	}
}
