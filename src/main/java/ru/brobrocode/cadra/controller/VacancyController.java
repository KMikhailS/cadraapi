package ru.brobrocode.cadra.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.brobrocode.cadra.dto.ApplyVacancyResponse;
import ru.brobrocode.cadra.dto.VacanciesDTO;
import ru.brobrocode.cadra.dto.VacancyApplicationRequest;
import ru.brobrocode.cadra.service.VacancyService;

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
	public void applyToAllVacancies(@PathVariable("resume_id") String resumeId) {
		vacancyService.applyToAllVacancies(resumeId);
	}
}
