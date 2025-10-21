package ru.brobrocode.cadra.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.service.JwtService;
import ru.brobrocode.cadra.service.UserService;
import ru.brobrocode.cadra.service.YuKassaCallbackService;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/callback/payment")
@RequiredArgsConstructor
@Slf4j
public class YuKassaCallbackController {

	private final YuKassaCallbackService webhookService;
	private final JwtService jwtService;
	private final UserService userService;

	@Value("${yukassa.redirect-url}")
	private String returnUrl;

	@PostMapping
	public ResponseEntity<Void> handleCallback(
			@RequestBody String rawPayload,
			@RequestHeader Map<String, String> headers,
			HttpServletRequest request) {

		try {
			log.debug("Webhook payload: {}", rawPayload);

			// Парсинг и обработка webhook'а
			webhookService.processCallback(rawPayload, headers);

			return ResponseEntity.ok().build();

		} catch (Exception e) {
			log.error("Error processing webhook", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GetMapping("/result")
	public void handleSuccessPayment(
			@RequestParam("userId") String userId,
			HttpServletResponse response) throws IOException {

		try {
			log.info("Processing payment result for user: {}", userId);

			// Получаем информацию о пользователе
			UserInfo user = userService.findById(userId);

			if (user == null) {
				log.error("User not found: {}", userId);
				response.sendRedirect(returnUrl + "/subscription?error=user_not_found");
				return;
			}

			// Генерируем JWT токены
			Map<String, Object> claims = new HashMap<>();
			claims.put("email", user.getEmail());
			claims.put("firstName", user.getFirstName());
			claims.put("lastName", user.getLastName());
			claims.put("registrationId", "hh"); // По умолчанию HeadHunter
			claims.put("authorities", List.of("ROLE_USER"));

			String accessToken = jwtService.generateAccessToken(userId, claims);
			String refreshToken = jwtService.generateRefreshToken(userId);

			// Обрабатываем результат оплаты
//			webhookService.processResult(userId);

			// Редирект на фронтенд с токенами
			String redirectUrl = String.format(
				"%s/subscription?accessToken=%s&refreshToken=%s",
					returnUrl,
				accessToken,
				refreshToken
			);

			log.info("Redirecting user {} to frontend with tokens", userId);
			response.sendRedirect(redirectUrl);

		} catch (Exception e) {
			log.error("Error processing payment result for user: {}", userId, e);
			response.sendRedirect(returnUrl + "/subscription?error=processing_failed");
		}
	}
}
