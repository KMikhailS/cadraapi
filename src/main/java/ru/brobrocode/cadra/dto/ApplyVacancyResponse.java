package ru.brobrocode.cadra.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ApplyVacancyResponse {
	private String vacancyId;
	private boolean isSuccess;
	private String message;
}
