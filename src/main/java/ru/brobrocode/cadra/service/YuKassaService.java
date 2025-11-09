package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.brobrocode.cadra.client.yukassa.YuKassaClient;
import ru.brobrocode.cadra.client.yukassa.YuKassaException;
import ru.brobrocode.cadra.client.yukassa.model.*;
import ru.brobrocode.cadra.dto.TariffResponse;
import ru.brobrocode.cadra.entity.Payment;
import ru.brobrocode.cadra.entity.PaymentStatus;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.repository.PaymentRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class YuKassaService {

	@Value("${yukassa.redirect-url}")
	private String returnUrl;

	private final YuKassaClient yuKassaClient;
	private final TariffService tariffService;
	private final PaymentRepository paymentRepository;
	private final UserStateService userStateService;

	public PaymentResponse createPayment(CreatePaymentRequest createPaymentRequest) {
		TariffResponse tariff = tariffService.getTariffByName(createPaymentRequest.getTariffName());
		UserInfo userInfo = userStateService.getUserInfo();
		BigDecimal amount = tariff.getPrice();
		String description = "Оплата тарифа " + tariff.getName();
		Map<String, Object> metaData = new HashMap<>();
		metaData.put("userId", userInfo.getId());
		metaData.put("tariffId", tariff.getId());

		// Формирование чека для 54-ФЗ
		String customerEmail = createPaymentRequest.getEmail();
		String phone = createPaymentRequest.getPhone();

		ReceiptCustomer customer;
		if (customerEmail != null) {
			customer = ReceiptCustomer.builder()
					.email(customerEmail)
					.build();
		} else {
			customer = ReceiptCustomer.builder()
					.phone(phone)
					.build();
		}

		Receipt receipt = Receipt.builder()
				.customer(customer)
				.items(java.util.Collections.singletonList(
						ReceiptItem.builder()
								.description(description)
								.quantity(BigDecimal.ONE)
								.amount(Amount.builder()
										.value(amount)
										.currency("RUB")
										.build())
								.vatCode(1)
								.paymentMode("full_payment")
								.paymentSubject("service")
								.build()
				))
				.build();

		PaymentRequest request = PaymentRequest.builder()
				.amount(Amount.builder()
						.value(amount)
						.currency("RUB")
						.build())
				.description(description)
				.confirmation(Confirmation.builder()
						.type("redirect")
						.returnUrl(returnUrl + "/api/callback/payment/result?userId=" + userInfo.getId())
						.build())
				.metadata(metaData)
				.capture(true)
				.receipt(receipt)
				.build();

		String idempotenceKey = UUID.randomUUID().toString();

		try {
			PaymentResponse paymentResponse = yuKassaClient.createPayment(idempotenceKey, request);
			savePayment(paymentResponse, userInfo.getId());
			return paymentResponse;
		} catch (Exception e) {
			log.error("Error creating payment", e);
			throw new YuKassaException("Failed to create payment", e);
		}
	}

	private Payment savePayment(PaymentResponse paymentResponse, String userId) {
		Payment payment = Payment.builder()
				.id(paymentResponse.getId())
				.description(paymentResponse.getDescription())
				.userId(userId)
				.amount(paymentResponse.getAmount().getValue())
				.status(PaymentStatus.fromString(paymentResponse.getStatus()))
				.createdAt(LocalDateTime.now())
				.updatedAt(LocalDateTime.now())
				.build();
		return paymentRepository.save(payment);
	}

	public PaymentResponse getPaymentStatus(String paymentId) {
		try {
			return yuKassaClient.getPayment(paymentId);
		} catch (YuKassaException e) {
			throw new YuKassaException("Payment not found: " + paymentId);
		}
	}

	public PaymentResponse capturePayment(String paymentId, BigDecimal amount) {
		CaptureRequest request = CaptureRequest.builder()
				.amount(Amount.builder()
						.value(amount)
						.currency("RUB")
						.build())
				.build();

		String idempotenceKey = UUID.randomUUID().toString();
		return yuKassaClient.capturePayment(paymentId, idempotenceKey, request);
	}

	public RefundResponse createRefund(String paymentId, BigDecimal amount) {
		RefundRequest request = RefundRequest.builder()
				.paymentId(paymentId)
				.amount(Amount.builder()
						.value(amount)
						.currency("RUB")
						.build())
				.build();

		String idempotenceKey = UUID.randomUUID().toString();
		return yuKassaClient.createRefund(idempotenceKey, request);
	}
}