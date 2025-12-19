package ru.brobrocode.cadra.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VacancyApplicationResponse {
    
    private boolean success;
    private String message;
    private int statusCode;
    
    public static VacancyApplicationResponse success(String message, int statusCode) {
        return new VacancyApplicationResponse(true, message, statusCode);
    }
    
    public static VacancyApplicationResponse error(String message, int statusCode) {
        return new VacancyApplicationResponse(false, message, statusCode);
    }
}