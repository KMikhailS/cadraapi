package ru.brobrocode.cadra.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.brobrocode.cadra.client.model.MeProfile;
import ru.brobrocode.cadra.client.model.ResumesMineItem;
import ru.brobrocode.cadra.client.model.ResumesMineResponse;
import ru.brobrocode.cadra.client.model.VacanciesVacanciesResponse;
import ru.brobrocode.cadra.dto.UserInfoDTO;
import ru.brobrocode.cadra.dto.VacanciesDTO;
import ru.brobrocode.cadra.service.UserService;

import java.util.List;


@RequiredArgsConstructor
@Slf4j
@Tag(name = "User Information", description = "APIs for retrieving current user information")
@RestController
public class UserController {

	private final UserService userService;

	@GetMapping("/me")
	@Operation(
			summary = "Get current user information",
			description = "Retrieves information about the currently authenticated user from hh.ru",
			responses = {
					@ApiResponse(
							responseCode = "200",
							description = "Successfully retrieved user information",
							content = @Content(
									mediaType = "application/json",
									schema = @Schema(implementation = MeProfile.class)
							)
					),
					@ApiResponse(
							responseCode = "403",
							description = "Authentication required or user not authorized"
					),
					@ApiResponse(
							responseCode = "500",
							description = "Internal server error when calling hh.ru API"
					)
			}
	)
	public ResponseEntity<UserInfoDTO> getCurrentUser() {
		return ResponseEntity.ok().body(userService.getCurrentUser());
	}

	@GetMapping("/resumes/mine")
	@Operation(
			summary = "Get current user information",
			description = "Retrieves information about the currently authenticated user from hh.ru",
			responses = {
					@ApiResponse(
							responseCode = "200",
							description = "Successfully retrieved user information",
							content = @Content(
									mediaType = "application/json",
									schema = @Schema(implementation = MeProfile.class)
							)
					),
					@ApiResponse(
							responseCode = "403",
							description = "Authentication required or user not authorized"
					),
					@ApiResponse(
							responseCode = "500",
							description = "Internal server error when calling hh.ru API"
					)
			}
	)
	public ResponseEntity<List<ResumesMineItem>> getMineResumes() {
		return ResponseEntity.ok().body(userService.getMineResumes());
	}
}