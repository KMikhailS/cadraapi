package ru.brobrocode.cadra.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.brobrocode.cadra.dto.AuthCodeRequest;
import ru.brobrocode.cadra.dto.AuthCodeResponse;
import ru.brobrocode.cadra.service.AuthService;

@RequiredArgsConstructor
@RestController
public class AuthController {

	private final AuthService authService;

	@ResponseBody
	@PostMapping("auth-code")
	public AuthCodeResponse auth(@RequestBody AuthCodeRequest authCodeRequest) {
		return authService.auth(authCodeRequest);
	}
}
