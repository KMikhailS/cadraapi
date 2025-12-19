package ru.brobrocode.cadra.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:4173", "http://localhost:3000", "https://cadra.online"})
public class UserProfileController {

	@GetMapping("/profile")
	public ResponseEntity<?> getUserProfile(@AuthenticationPrincipal OAuth2User principal,
	                                        Authentication authentication) {

		// Проверяем тип authentication
		if (!(authentication instanceof OAuth2AuthenticationToken)) {
			return ResponseEntity.status(401).body("Invalid authentication type");
		}

		OAuth2AuthenticationToken oauthToken = (OAuth2AuthenticationToken) authentication;

		Map<String, Object> response = new HashMap<>();
		response.put("name", principal.getName());
		response.put("attributes", principal.getAttributes());
		response.put("authorities", principal.getAuthorities());
		response.put("registrationId", oauthToken.getAuthorizedClientRegistrationId());

		return ResponseEntity.ok(response);
	}

	@GetMapping("/info")
	public ResponseEntity<?> getUserInfo(Authentication authentication) {
		if (authentication instanceof OAuth2AuthenticationToken) {
			OAuth2AuthenticationToken token = (OAuth2AuthenticationToken) authentication;
			OAuth2User user = token.getPrincipal();

			return ResponseEntity.ok(Map.of(
					"authenticated", true,
					"principal", user.getName(),
					"email", Objects.requireNonNull(user.getAttribute("email")),
					"registrationId", token.getAuthorizedClientRegistrationId()
			));
		}
		return ResponseEntity.status(401).body("Not authenticated");
	}
}
