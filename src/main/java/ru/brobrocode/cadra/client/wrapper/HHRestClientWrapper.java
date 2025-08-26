package ru.brobrocode.cadra.client.wrapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.brobrocode.cadra.client.api.MeApi;
import ru.brobrocode.cadra.client.api.ResumesApi;
import ru.brobrocode.cadra.client.model.MeProfile;
import ru.brobrocode.cadra.client.model.ResumesMineResponse;
import ru.brobrocode.cadra.client.model.VacanciesVacanciesResponse;

import static ru.brobrocode.cadra.constants.HHApiConstants.*;

@Slf4j
@RequiredArgsConstructor
@Service
public class HHRestClientWrapper {

	private final UserInfoHolder userInfoHolder;
	private final MeApi meApi;
	private final ResumesApi resumesApi;

	public MeProfile getCurrentUser(String userId) {
		log.info("Get current user {}", userId);
		userInfoHolder.setUserInfo(userId);
		try {
			ResponseEntity<MeProfile> response = meApi.getCurrentUserInfo(
					DEFAULT_USER_AGENT,
					DEFAULT_LOCALE,
					DEFAULT_HOST
			);

			MeProfile userProfile = response.getBody();
			log.info("Successfully retrieved user profile with auth_type: {}",
					userProfile != null ? userProfile.getAuthType() : "null");

			return userProfile;
		} catch (Exception e) {
			log.error("Error getting current user information", e);
			throw new RuntimeException("Failed to retrieve user information from hh.ru", e);
		} finally {
			userInfoHolder.resetUserInfo();
		}
	}

	public ResumesMineResponse getMineResumes(String userId) {
		log.info("Get current user {}", userId);
		userInfoHolder.setUserInfo(userId);
		try {
			ResponseEntity<ResumesMineResponse> response = resumesApi.getMineResumes(
					DEFAULT_USER_AGENT,
					DEFAULT_LOCALE,
					DEFAULT_HOST
			);

			ResumesMineResponse userProfile = response.getBody();

			return userProfile;
		} catch (Exception e) {
			log.error("Error getting current user information", e);
			throw new RuntimeException("Failed to retrieve user information from hh.ru", e);
		} finally {
			userInfoHolder.resetUserInfo();
		}
	}

	public VacanciesVacanciesResponse getVacanciesSimilarToResume(String resumeId, String userId) {
		log.info("Get current user {}", userId);
		userInfoHolder.setUserInfo(userId);
		try {
			ResponseEntity<VacanciesVacanciesResponse> response = resumesApi.getVacanciesSimilarToResume(
					resumeId,
					DEFAULT_USER_AGENT,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					null,
					DEFAULT_LOCALE,
					DEFAULT_HOST
			);

			VacanciesVacanciesResponse vacanciesVacanciesResponse = response.getBody();

			return vacanciesVacanciesResponse;
		} catch (Exception e) {
			log.error("Error getting current user information", e);
			throw new RuntimeException("Failed to retrieve user information from hh.ru", e);
		} finally {
			userInfoHolder.resetUserInfo();
		}
	}
}
