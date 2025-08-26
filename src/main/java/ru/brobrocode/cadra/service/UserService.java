package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import ru.brobrocode.cadra.client.model.MeProfile;
import ru.brobrocode.cadra.client.model.ResumesMineItem;
import ru.brobrocode.cadra.client.model.ResumesMineResponse;
import ru.brobrocode.cadra.client.model.VacanciesVacanciesResponse;
import ru.brobrocode.cadra.client.wrapper.HHRestClientWrapper;
import ru.brobrocode.cadra.entity.Resume;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.repository.ResumeRepository;
import ru.brobrocode.cadra.repository.UserInfoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final HHRestClientWrapper clientWrapper;
    private final UserInfoRepository userInfoRepository;
    private final ResumeRepository resumeRepository;

    public MeProfile getCurrentUser(String userId) {
        getUserInfo(userId);
        MeProfile currentUser = clientWrapper.getCurrentUser(userId);
        return currentUser;
    }

    public ResumesMineResponse getMineResumes(String userId) {
        UserInfo userInfo = getUserInfo(userId);
        ResumesMineResponse resumes = clientWrapper.getMineResumes(userId);
        List<ResumesMineItem> items = resumes.getItems();
        if (items != null && !items.isEmpty()) {
            items.forEach(resumeItem -> saveResume(resumeItem, userInfo));
        }

        return resumes;
    }

    private void saveResume(ResumesMineItem resumeItem, UserInfo userInfo) {
        Resume resume = new Resume();
        resume.setId(resumeItem.getId());
        resume.setTitle(resumeItem.getTitle());
        resume.setUser(userInfo);
        resumeRepository.save(resume);
    }

    public VacanciesVacanciesResponse getVacanciesSimilarToResume(String resumeId, String userId) {
        getUserInfo(userId);
        VacanciesVacanciesResponse vacanciesVacanciesResponse = clientWrapper.getVacanciesSimilarToResume(resumeId, userId);
        return vacanciesVacanciesResponse;
    }

    private @NotNull UserInfo getUserInfo(String userId) {
        UserInfo userInfo = userInfoRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        if (userInfo.getAccessToken() == null) {
            throw new IllegalArgumentException("User not authenticated");
        }
        return userInfo;
    }
}