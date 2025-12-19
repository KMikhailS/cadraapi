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

	private final YuKassaCallbackService yuKassaCallbackService;

	@PostMapping
	public ResponseEntity<Void> handleCallback(
			@RequestBody String rawPayload,
			@RequestHeader Map<String, String> headers,
			HttpServletRequest request) {

		try {
			log.debug("Webhook payload: {}", rawPayload);

			// Парсинг и обработка webhook'а
			yuKassaCallbackService.processCallback(rawPayload, headers);

			return ResponseEntity.ok().build();

		} catch (Exception e) {
			log.error("Error processing webhook", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GetMapping("/result")
	public void handleSuccessPayment(
			@RequestParam("userId") String userId, HttpServletResponse response) throws IOException {
		yuKassaCallbackService.handleSuccessPayment(userId, response);
	}
}
