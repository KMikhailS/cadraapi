package ru.brobrocode.cadra.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tariffs")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tariff {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tariff_seq")
	@SequenceGenerator(name = "tariff_seq", sequenceName = "cdr_tariffs", allocationSize = 1)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "price", precision = 15, scale = 2)
	private BigDecimal price;

	@Column(name = "max_responses")
	private Integer maxResponses;

	@Column(name = "max_responses_per_day")
	private Integer maxResponsesPerDay;

	@Column(name = "is_send_letter")
	private Boolean isSendLetter;

	@Column(name = "color")
	private String color;

	@Column(name = "description")
	private String description;

	@Column(name = "features")
	private String features;

	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "expiration_days")
	private Long expirationDays;

	@Column(name = "created_at", nullable = false)
	@CreatedDate
	private LocalDateTime createdAt = LocalDateTime.now();

	@Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt = LocalDateTime.now();
}
