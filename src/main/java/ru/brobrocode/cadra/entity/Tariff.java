package ru.brobrocode.cadra.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tariffs")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "users")
@EqualsAndHashCode(exclude = "users")
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

	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "created_at", nullable = false)
	@CreatedDate
	private LocalDateTime createdAt = LocalDateTime.now();

	@Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt = LocalDateTime.now();

	// One-to-many relationship with UserInfo
	@OneToMany(mappedBy = "tariff", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<UserInfo> users;
}
