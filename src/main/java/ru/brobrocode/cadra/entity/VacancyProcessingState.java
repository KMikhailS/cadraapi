package ru.brobrocode.cadra.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "vacancy_processing_state")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString()
@EqualsAndHashCode()
public class VacancyProcessingState {

	@Id
	@Column(name = "id", nullable = false, updatable = false)
	private String id;

	@Column(name = "resume_id", nullable = false, updatable = false)
	private String resumeId;

	@Enumerated(EnumType.STRING)
	@Column(name = "status", nullable = false, length = 64)
	private Status status;

	@Column(name = "applied_vacancies")
	private Integer appliedVacancies;

	@Column(name = "applied_date", nullable = false)
	private LocalDate appliedDate;

	@Column(name = "created_at", nullable = false)
	@CreatedDate
	private LocalDateTime createdAt = LocalDateTime.now();

	@Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt = LocalDateTime.now();

	public enum Status {
		PROCESS,
		COMPLETED,
		ERROR
	}
}
