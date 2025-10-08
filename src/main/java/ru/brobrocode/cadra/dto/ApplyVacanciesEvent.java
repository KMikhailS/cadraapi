package ru.brobrocode.cadra.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ApplyVacanciesEvent {
	private final String processId;
	private final String resumeId;
	private final List<String> vacancyIds;
}
