package ru.brobrocode.cadra.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ResumeProfileDTO {
	private String id;
	private String name;
	private String title;
	private String workExperience;
	private String skills;
	private String phone;
	private String email;
}
