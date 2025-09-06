package ru.brobrocode.cadra.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "selected_tariff")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SelectedTariff {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "selected_tariff_seq")
	@SequenceGenerator(name = "selected_tariff_seq", sequenceName = "cdr_selected_tariffs", allocationSize = 1)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tariff_id")
	private Tariff tariff;

	@Column(name = "spent_responses")
	private Integer spentResponses;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private UserInfo user;

	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "expires_at", nullable = false)
	private LocalDate expiresAt;

	@Column(name = "created_at", nullable = false)
	@CreatedDate
	private LocalDateTime createdAt = LocalDateTime.now();

	@Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt = LocalDateTime.now();
}
