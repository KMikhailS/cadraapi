package ru.brobrocode.cadra.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.brobrocode.cadra.dto.RefreshTokenRequest;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.service.JwtService;
import ru.brobrocode.cadra.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("auth")
public class AuthController {

	private final JwtService jwtService;
	private final UserService userService;

	@GetMapping("validate")
	public ResponseEntity<?> validateToken(@RequestHeader("Authorization") String authHeader) {
		if (authHeader != null && authHeader.startsWith("Bearer ")) {
			String token = authHeader.substring(7);
			if (jwtService.validateToken(token)) {
				return ResponseEntity.ok(Map.of("valid", true));
			}
		}
		return ResponseEntity.status(401).body(Map.of("valid", false));
	}

	@PostMapping("refresh")
	public ResponseEntity<?> refreshToken(@RequestBody RefreshTokenRequest request) {
		String refreshToken = request.getRefreshToken();

		if (!jwtService.validateToken(refreshToken) || !jwtService.isRefreshToken(refreshToken)) {
			return ResponseEntity.status(401).body("Invalid refresh token");
		}

		String userId = jwtService.extractUserId(refreshToken);
		UserInfo user = userService.findById(userId);

		// Создаем новые claims
		Map<String, Object> claims = new HashMap<>();
		String email = user.getEmail();
		if (email != null && !email.isEmpty()) {
			claims.put("email", email);
		}
		String phone = user.getPhone();
		if (phone != null && !phone.isEmpty()) {
			claims.put("phone", phone);
		}
		claims.put("email", user.getEmail());
		claims.put("firstName", user.getFirstName());
		claims.put("lastName", user.getLastName());
		claims.put("registrationId", "hh");
		claims.put("authorities", List.of("ROLE_USER"));

		// Генерируем новые токены
		String newAccessToken = jwtService.generateAccessToken(userId, claims);
		String newRefreshToken = jwtService.generateRefreshToken(userId);

		return ResponseEntity.ok(Map.of(
				"accessToken", newAccessToken,
				"refreshToken", newRefreshToken,
				"expiresIn", 900000
		));
	}

	@PostMapping("/logout")
	public ResponseEntity<?> logout() {
		// JWT stateless, просто удаляем токен на клиенте
		return ResponseEntity.ok(Map.of("message", "Logged out successfully"));
	}
}