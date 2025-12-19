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
@Table(name = "payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

	@Id
	@Column(name = "id", nullable = false, updatable = false)
	private String id;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "description")
	private String description;

	@Column(name = "tariff_id")
	private Long tariffId;

	@Column(name = "amount", precision = 15, scale = 2)
	private BigDecimal amount;

	@Column(name = "income_amount", precision = 15, scale = 2)
	private BigDecimal incomeAmount;

	@Column(name = "payment_method_type")
	private String paymentMethodType;

	@Enumerated(EnumType.STRING)
	@Column(name = "status", nullable = false, length = 36)
	private PaymentStatus status = PaymentStatus.CREATED;

	@Column(name = "created_at", nullable = false)
	@CreatedDate
	private LocalDateTime createdAt = LocalDateTime.now();

	@Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt = LocalDateTime.now();
}
