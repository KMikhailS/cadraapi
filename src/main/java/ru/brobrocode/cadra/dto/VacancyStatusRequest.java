package ru.brobrocode.cadra.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.brobrocode.cadra.entity.VacancyProcessingState;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class VacancyStatusRequest {
	private VacancyProcessingState.Status status;
	private List<String> vacancyIds;
	private String resumeId;
}
