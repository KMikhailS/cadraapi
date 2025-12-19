package ru.brobrocode.cadra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.brobrocode.cadra.entity.VacancyProcessingState;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
public interface VacancyProcessingStateRepository extends JpaRepository<VacancyProcessingState, String> {

	List<VacancyProcessingState> findAllByResumeIdInAndStatusAndAppliedDate(Collection<String> resumeIds, VacancyProcessingState.Status status, LocalDate appliedDate);

	List<VacancyProcessingState> findAllByResumeIdInAndStatus(Collection<String> resumeIds, VacancyProcessingState.Status status);

	List<VacancyProcessingState> findAllByResumeIdAndStatus(String resumeId, VacancyProcessingState.Status status);

}
