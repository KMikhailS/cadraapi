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
public class VacancyProcessingStateDTO {
	private String id;
	private String resumeId;
	private int applyVacanciesCount;
	private VacancyProcessingState.Status status;
	private String processedVacancyIds;
}
