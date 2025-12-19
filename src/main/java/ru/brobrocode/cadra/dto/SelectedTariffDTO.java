package ru.brobrocode.cadra.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SelectedTariffDTO {
	private String title;
	private Boolean isActive;
	private Integer maxResponses;
	private Integer spentResponses;
	private Integer availableVacanciesForToday;
}
