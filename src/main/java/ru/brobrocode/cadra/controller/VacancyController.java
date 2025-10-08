package ru.brobrocode.cadra.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.brobrocode.cadra.dto.*;
import ru.brobrocode.cadra.service.VacancyService;

@Slf4j
@RequiredArgsConstructor
@Tag(name = "Vacancy Operations", description = "APIs for vacancy operations")
@RestController
@RequestMapping("vacancies")
public class VacancyController {
	
	private final VacancyService vacancyService;

	@GetMapping("{resume_id}")
	public ResponseEntity<VacanciesDTO> getVacanciesSimilarToResume(@PathVariable("resume_id") String resumeId, @RequestParam("page") Integer page, @RequestParam("perPage") Integer perPage) {
		return ResponseEntity.ok().body(vacancyService.getVacanciesSimilarToResume(resumeId, page, perPage));
	}

	@PostMapping("apply")
	public ResponseEntity<ApplyVacancyResponse> applyToVacancy(@Valid @RequestBody VacancyApplicationRequest request) {
		ApplyVacancyResponse response = vacancyService.applyToVacancy(request);
		
		if (response.isSuccess()) {
			return ResponseEntity.ok(response);
		} else {
			return ResponseEntity.badRequest().body(response);
		}
	}

	@PostMapping("apply/all/{resume_id}")
	public ResponseEntity<ApplyVacanciesResponse> applyToAllVacancies(@PathVariable("resume_id") String resumeId, @RequestBody AvailableVacanciesRequest request) {
		ApplyVacanciesResponse response = vacancyService.applyToAllVacancies(resumeId, request);
		log.info("ApplyVacanciesResponse: {}", response);
		return ResponseEntity.ok(response);
	}

	@GetMapping("available/{resume_id}")
	public ResponseEntity<AvailableVacanciesResponse> getAvailableVacancies(@PathVariable("resume_id") String resumeId) {
		AvailableVacanciesResponse response = vacancyService.getAvailableVacancies(resumeId);
		log.info("AvailableVacanciesResponse: {}", response);
		return ResponseEntity.ok(response);
	}

	@GetMapping("apply-status/{process_id}")
	public ResponseEntity<ApplyStatusResponse> getApplyVacancyStatus(@PathVariable("process_id") String processId) {
		ApplyStatusResponse response = vacancyService.getApplyVacancyStatus(processId);
		log.info("ApplyStatusResponse: {}", response);
		return ResponseEntity.ok(response);
	}
}
