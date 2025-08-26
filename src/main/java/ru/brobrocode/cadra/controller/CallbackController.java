package ru.brobrocode.cadra.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.brobrocode.cadra.dto.AuthCodeRequest;

@RequiredArgsConstructor
@RestController
public class CallbackController {

	@GetMapping("hello")
	public String home() {
		return "Hello World";
	}

	@PostMapping("home")
	public String homeCallback(@RequestBody AuthCodeRequest authCodeRequest) {
		return authCodeRequest.getCode();
	}
}
