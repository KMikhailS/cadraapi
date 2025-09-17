package ru.brobrocode.cadra.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VacancyItemDTO {
	private String id;
	private String name;
	private String type;
	private String url;
	/**
	 * Разрешен ли отклик на вакансию неполным резюме
	 */
	private Boolean acceptIncompleteResumes;
	/**
	 * Находится ли данная вакансия в архиве
	 */
	private Boolean archived;
	/**
	 * Обязательно ли заполнять сообщение при отклике на вакансию
	 */
	private Boolean responseLetterRequired;

	/**
	 * Информация о наличии прикрепленного тестового задании к вакансии
	 */
	private Boolean hasTest;

}
