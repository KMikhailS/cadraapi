package ru.brobrocode.cadra.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VacancyApplicationRequest {
    
    @NotBlank(message = "Resume ID is required")
    private String resumeId;
    
    @NotBlank(message = "Vacancy ID is required")
    private String vacancyId;
    
    @Size(max = 10000, message = "Message length cannot exceed 10000 characters")
    private String message;
}