package ru.brobrocode.cadra.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.brobrocode.cadra.service.YuKassaCallbackService;

import java.util.Map;

@RestController
@RequestMapping("/callback/payment")
@RequiredArgsConstructor
@Slf4j
public class YuKassaCallbackController {

	private final YuKassaCallbackService webhookService;

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
}
