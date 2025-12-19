package ru.brobrocode.cadra.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthCodeResponse {
	private String userId;

	public AuthCodeResponse(String userId) {
		this.userId = userId;
	}
}

