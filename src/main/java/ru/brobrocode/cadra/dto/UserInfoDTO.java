package ru.brobrocode.cadra.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class UserInfoDTO {
	private String id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String phoneNumber;
	private String authCode;
	private String accessToken;
	private String refreshToken;
	private String role;
	private Long tariffId;
	private LocalDateTime expiresAt;
}
