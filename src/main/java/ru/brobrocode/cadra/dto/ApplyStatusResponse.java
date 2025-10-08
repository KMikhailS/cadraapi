package ru.brobrocode.cadra.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ru.brobrocode.cadra.entity.VacancyProcessingState;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ApplyStatusResponse {
	private String processId;
	private String message;
	private VacancyProcessingState.Status status;
}
