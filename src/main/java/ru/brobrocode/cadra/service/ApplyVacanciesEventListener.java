package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;
import ru.brobrocode.cadra.dto.ApplyVacanciesEvent;
import ru.brobrocode.cadra.entity.VacancyProcessingState;
import ru.brobrocode.cadra.repository.VacancyProcessingStateRepository;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class ApplyVacanciesEventListener {

	@Value("${cadra.sleep-time}")
	private Long sleepTime;

	private final VacancyProcessingStateRepository vacancyProcessingStateRepository;

	@TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
	@Async
	public void processEvent(final ApplyVacanciesEvent event) {
		log.info("Event received: " + event);
		String processId = event.getProcessId();
		String resumeId = event.getResumeId();
		List<String> vacancyIds = event.getVacancyIds();

		VacancyProcessingState vacancyProcessingState = vacancyProcessingStateRepository.findById(processId).orElse(null);
		log.info("vacancyProcessingState received: " + vacancyProcessingState);
		if (vacancyProcessingState != null) {
			try {
				Thread.sleep(10000);
				vacancyProcessingState.setStatus(VacancyProcessingState.Status.COMPLETED);
				vacancyProcessingState.setAppliedVacancies(vacancyIds.size());
				vacancyProcessingState.setAppliedDate(LocalDate.now());
				vacancyProcessingStateRepository.save(vacancyProcessingState);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			//		int userNegotiationsCount = getUserNegotiationsCount(selectedTariff);
//		if (userNegotiationsCount <= 0) {
//			throw new TariffException("Нет доступных откликов");
//		}
//		VacanciesDTO vacancies = getAllVacanciesSimilarToResume(resumeId);
//		int applyVacanciesCount = 0;
//		if (vacancies != null && vacancies.getItems() != null && !vacancies.getItems().isEmpty()) {
//			List<VacancyItemDTO> items = vacancies.getItems().stream()
//					.filter(this::isAvailableVacancy)
//					.toList();
//			for(VacancyItemDTO item : items) {
//				if (applyVacanciesCount > userNegotiationsCount) {
//					break;
//				}
//				VacancyApplicationRequest request = new VacancyApplicationRequest();
//				request.setResumeId(resumeId);
//				request.setVacancyId(item.getId());
//				ApplyVacancyResponse applyVacancyResponse = applyToVacancy(request);
//				if (applyVacancyResponse != null && applyVacancyResponse.isSuccess()) {
//					applyVacanciesCount++;
//				}
//			}
//		}
//		Integer spentResponses = selectedTariff.getSpentResponses();
//		selectedTariff.setSpentResponses(spentResponses + applyVacanciesCount);
//		selectedTariffRepository.save(selectedTariff);
		}
	}
}
