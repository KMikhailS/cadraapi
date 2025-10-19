package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;
import ru.brobrocode.cadra.client.api.NegotiationsApi;
import ru.brobrocode.cadra.client.api.ResumeProfileApi;
import ru.brobrocode.cadra.client.api.VacanciesApi;
import ru.brobrocode.cadra.client.model.ResumeObjectsExperience;
import ru.brobrocode.cadra.client.model.ResumeProfileResumeProfileResponse;
import ru.brobrocode.cadra.client.model.ResumeViewApplicantResume;
import ru.brobrocode.cadra.client.model.VacanciesVacancy;
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
	private final ResumeProfileApi resumeProfileApi;
	private final VacanciesApi vacanciesApi;
	private final SelectedTariffRepository selectedTariffRepository;
	private final GigaChatService gigaChatService;

	@TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
	@Async
	public void processEvent(final ApplyVacanciesEvent event) {
		log.info("Event received: {}", event);
		String processId = event.getProcessId();
		String resumeId = event.getResumeId();
		String phone = event.getPhone();
		String email = event.getEmail();
		String token = event.getToken();
		List<String> vacancyIds = event.getVacancyIds();
		Long selectedTariffId = event.getSelectedTariffId();

		VacancyProcessingState vacancyProcessingState = vacancyProcessingStateRepository.findById(processId).orElse(null);
		log.info("vacancyProcessingState received: {}", vacancyProcessingState);
		if (vacancyProcessingState != null) {
			ResumeProfileDTO resumeProfile = getResumeProfile(resumeId, phone, email, token);
			log.info("ResumeProfile received: {}", resumeProfile);
			int applyVacanciesCount = 0;
			for (String vacancyId : vacancyIds) {
				VacancyItemDTO vacancyItem = getVacancyItem(vacancyId, token);
//				String coverLetter = gigaChatService.getCoverLetter(resumeProfile, vacancyItem);
				String coverLetter = "letter";
				log.info("Cover letter generated: {}", coverLetter);
				VacancyApplicationRequest request = new VacancyApplicationRequest();
				request.setResumeId(resumeId);
				request.setVacancyId(vacancyId);
				request.setMessage(coverLetter);
//				boolean isSuccessApplying = applyToVacancy(request, token);
				boolean isSuccessApplying = applyToVacancy();
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

	private ResumeProfileDTO getResumeProfile(String resumeId, String phone, String email, String token) {
		ResumeProfileDTO resumeProfileDTO = new ResumeProfileDTO();
		ResponseEntity<ResumeProfileResumeProfileResponse> profileResponse = resumeProfileApi.readResumeProfile(
				resumeId,
				DEFAULT_USER_AGENT,
				"Bearer " + token,
				DEFAULT_LOCALE,
				DEFAULT_HOST);
		if (profileResponse != null && profileResponse.getBody() != null) {
			ResumeViewApplicantResume resume = profileResponse.getBody().getResume();
			resumeProfileDTO.setId(resume.getId());
			resumeProfileDTO.setName(resume.getLastName() + " " + resume.getFirstName() + " " + resume.getMiddleName());
			resumeProfileDTO.setEmail(email);
			resumeProfileDTO.setPhone(phone);
			resumeProfileDTO.setTitle(resume.getTitle());
			StringBuilder experienceBuilder = new StringBuilder();
			for (ResumeObjectsExperience experience : resume.getExperience()) {
				experienceBuilder.append("Должность ").append(experience.getPosition());
				experienceBuilder.append(" ");
				experienceBuilder.append("Обязанности ").append(experience.getDescription());
				experienceBuilder.append(" ");
			}
			resumeProfileDTO.setWorkExperience(experienceBuilder.toString());
			StringBuilder skillBuilder = new StringBuilder();
			if (resume.getSkillSet() != null) {
				skillBuilder.append("Навыки: ");
				for (String skill : resume.getSkillSet()) {
					skillBuilder.append(skill).append(";");
				}
			}
			resumeProfileDTO.setSkills(skillBuilder.toString());
		}
		return resumeProfileDTO;
	}

	private VacancyItemDTO getVacancyItem(String vacancyId, String token) {
		VacancyItemDTO vacancyItemDTO = new VacancyItemDTO();
		ResponseEntity<VacanciesVacancy> vacancyResponse = vacanciesApi.getVacancy(
				vacancyId,
				DEFAULT_USER_AGENT,
				"Bearer " + token,
				DEFAULT_LOCALE,
				DEFAULT_HOST);
		if (vacancyResponse != null && vacancyResponse.getBody() != null) {
			VacanciesVacancy vacancy = vacancyResponse.getBody();
			vacancyItemDTO.setName(vacancy.getName());
			vacancyItemDTO.setDescription(vacancy.getDescription());
		}
		return vacancyItemDTO;
	}

	public boolean applyToVacancy() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return true;
	}

	public boolean applyToVacancy(VacancyApplicationRequest request, String token) {
		try {
			ResponseEntity<String> response = negotiationsApi.applyToVacancy(
					DEFAULT_USER_AGENT,
					"Bearer " + token,
					request.getResumeId(),
					request.getVacancyId(),
					DEFAULT_LOCALE,
					DEFAULT_HOST,
					request.getMessage()
			);

			HttpStatusCode statusCode = response.getStatusCode();
			log.info("ApplyToVacancy statusCode: {} for vacancy: {}", statusCode.value(), request.getVacancyId());
			if (statusCode.is2xxSuccessful()) {
				return true;
			}
		} catch (Exception e) {
			log.error("Error applying to vacancy: {}", e.getMessage(), e);
		}
		return false;
	}
}
