package ru.brobrocode.cadra.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.brobrocode.cadra.client.model.MeProfile;
import ru.brobrocode.cadra.client.model.ResumesMineResponse;
import ru.brobrocode.cadra.client.model.VacanciesVacanciesResponse;
import ru.brobrocode.cadra.service.UserService;


@RequiredArgsConstructor
@Slf4j
@Tag(name = "User Information", description = "APIs for retrieving current user information")
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/me/{userId}")
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
    public ResponseEntity<MeProfile> getCurrentUser(@PathVariable("userId") String userId) {
        return ResponseEntity.ok().body(userService.getCurrentUser(userId));
    }

    @GetMapping("/resumes/mine/{userId}")
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
    public ResponseEntity<ResumesMineResponse> getMineResumes(@PathVariable("userId") String userId) {
        return ResponseEntity.ok().body(userService.getMineResumes(userId));
    }

    @GetMapping("vacancies/{resume_id}/{userId}")
    public ResponseEntity<VacanciesVacanciesResponse> getVacanciesSimilarToResume(@PathVariable("resume_id") String resumeId,
                                                                                  @PathVariable("userId") String userId) {
        return ResponseEntity.ok().body(userService.getVacanciesSimilarToResume(resumeId, userId));
    }


}