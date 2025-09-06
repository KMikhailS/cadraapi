package ru.brobrocode.cadra.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResumeDTO {
	private String id;
	private String title;
	private Integer vacanciesToApply;
}
