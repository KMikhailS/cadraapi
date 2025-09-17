package ru.brobrocode.cadra.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TariffRequest {

    @NotBlank(message = "Name is required")
    @Size(min = 1, max = 255, message = "Name must be between 1 and 255 characters")
    private String name;

    @NotNull(message = "Price is required")
    @DecimalMin(value = "0.00", message = "Price must be greater than or equal to 0")
    @Digits(integer = 13, fraction = 2, message = "Price must have at most 13 integer digits and 2 decimal places")
    private BigDecimal price;

    @Min(value = 0, message = "Max responses must be greater than or equal to 0")
    private Integer maxResponses;

    @NotNull(message = "Active status is required")
    private Boolean isActive;

    private String color;
    private String description;
    private String features;
    private String authCode;
    private Long expirationDays;
}