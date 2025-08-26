package ru.brobrocode.cadra.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class UserInfoRequest {
	private String firstName;
	private String phoneNumber;
	private String authCode;
	private String accessToken;
	private String refreshToken;
	private LocalDateTime expiresAt;
}
