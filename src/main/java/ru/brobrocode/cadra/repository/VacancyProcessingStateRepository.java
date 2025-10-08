package ru.brobrocode.cadra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.brobrocode.cadra.entity.VacancyProcessingState;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface VacancyProcessingStateRepository extends JpaRepository<VacancyProcessingState, String> {

	List<VacancyProcessingState> findAllByResumeIdAndStatusAndAppliedDate(String resumeId, VacancyProcessingState.Status status, LocalDate appliedDate);

}
