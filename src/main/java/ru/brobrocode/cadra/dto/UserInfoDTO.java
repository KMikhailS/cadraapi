package ru.brobrocode.cadra.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UserInfoDTO {
	private String id;
	private String phone;
	private String email;
	private String firstName;
	private String lastName;
	private String middleName;
	private Boolean showOnboarding;
	private SelectedTariffDTO selectedTariff;
	private List<ResumeDTO> resumes;
	private String message;
	private String accessToken;
}
