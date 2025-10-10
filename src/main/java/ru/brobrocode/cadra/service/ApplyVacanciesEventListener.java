package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;
import ru.brobrocode.cadra.client.api.NegotiationsApi;
import ru.brobrocode.cadra.config.exception.TariffException;
import ru.brobrocode.cadra.dto.*;
import ru.brobrocode.cadra.entity.SelectedTariff;
import ru.brobrocode.cadra.entity.VacancyProcessingState;
import ru.brobrocode.cadra.repository.SelectedTariffRepository;
import ru.brobrocode.cadra.repository.VacancyProcessingStateRepository;

import java.time.LocalDate;
import java.util.List;

import static ru.brobrocode.cadra.constants.HHApiConstants.*;

@Component
@RequiredArgsConstructor
@Slf4j
public class ApplyVacanciesEventListener {

	private final VacancyProcessingStateRepository vacancyProcessingStateRepository;
	private final NegotiationsApi negotiationsApi;
	private final SelectedTariffRepository selectedTariffRepository;

	@TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
	@Async
	public void processEvent(final ApplyVacanciesEvent event) {
		log.info("Event received: " + event);
		String processId = event.getProcessId();
		String resumeId = event.getResumeId();
		List<String> vacancyIds = event.getVacancyIds();
		Long selectedTariffId = event.getSelectedTariffId();

		VacancyProcessingState vacancyProcessingState = vacancyProcessingStateRepository.findById(processId).orElse(null);
		log.info("vacancyProcessingState received: " + vacancyProcessingState);
		if (vacancyProcessingState != null) {
			int applyVacanciesCount = 0;
			for (String vacancyId : vacancyIds) {
				VacancyApplicationRequest request = new VacancyApplicationRequest();
				request.setResumeId(resumeId);
				request.setVacancyId(vacancyId);
				boolean isSuccessApplying = applyToVacancy(request);
				if (isSuccessApplying) {
					applyVacanciesCount++;
				}
			}
			SelectedTariff selectedTariff = selectedTariffRepository.findById(selectedTariffId)
					.orElseThrow(() -> new IllegalStateException("Can't find selected tariff with id: " + selectedTariffId));
			Integer spentResponses = selectedTariff.getSpentResponses();
			selectedTariff.setSpentResponses(spentResponses + applyVacanciesCount);
			selectedTariffRepository.save(selectedTariff);

			vacancyProcessingState.setStatus(VacancyProcessingState.Status.COMPLETED);
			vacancyProcessingState.setAppliedVacancies(applyVacanciesCount);
			vacancyProcessingState.setAppliedDate(LocalDate.now());
			vacancyProcessingStateRepository.save(vacancyProcessingState);
		}
	}

	public boolean applyToVacancy(VacancyApplicationRequest request) {
		try {
			Thread.sleep(3000);
//			ResponseEntity<String> response = negotiationsApi.applyToVacancy(
//					DEFAULT_USER_AGENT,
//					request.getResumeId(),
//					request.getVacancyId(),
//					DEFAULT_LOCALE,
//					DEFAULT_HOST,
//					request.getMessage()
//			);
//
//			int statusCode = response.getStatusCode().value();
//
//			if (statusCode == 210) {
//				return true;
//			} else if (statusCode == 400) {
//				return false;
//			}

		} catch (Exception e) {
			log.error("Error applying to vacancy: {}", e.getMessage(), e);
			return false;
		}
		return true;
	}
}
