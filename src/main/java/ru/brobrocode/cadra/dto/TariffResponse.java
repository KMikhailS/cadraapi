package ru.brobrocode.cadra.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TariffResponse {
    private Long id;
    private String name;
    private BigDecimal price;
    private Integer maxResponses;
    private String description;
    private String color;
    private List<String> features;
}