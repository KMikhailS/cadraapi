package ru.brobrocode.cadra.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = {"resumes", "tariff"})
@EqualsAndHashCode(exclude = {"resumes", "tariff"})
public class UserInfo {

	@Id
	@UuidGenerator
	@Column(name = "id", length = 32, nullable = false, updatable = false)
	private String id;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "role", length = 100)
	private String role;

	@Column(name = "auth_code")
	private String authCode;

	@Column(name = "access_token")
	private String accessToken;

	@Column(name = "refresh_token")
	private String refreshToken;

	@Column(name = "expires_at")
	@CreatedDate
	private LocalDateTime expiresAt;

	@Column(name = "created_at", nullable = false)
	@CreatedDate
	private LocalDateTime createdAt = LocalDateTime.now();

	@Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt = LocalDateTime.now();

	// Many-to-one relationship with Tariff
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tariff_id", foreignKey = @ForeignKey(name = "fk_users_tariff"))
	private Tariff tariff;

	// One-to-many relationship with Resume
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Resume> resumes;
}
