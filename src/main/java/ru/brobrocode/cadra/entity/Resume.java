package ru.brobrocode.cadra.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "resumes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = {"user", "negotiation"})
@EqualsAndHashCode(exclude = {"user", "negotiation"})
public class Resume {

	@Id
	@Column(name = "id", nullable = false, updatable = false)
	private String id;

	@Column(name = "title", length = 500)
	private String title;

	@Lob
	@Column(name = "pdf_link")
	private String pdfLink;

	@Column(name = "created_at", nullable = false)
	@CreatedDate
	private LocalDateTime createdAt = LocalDateTime.now();

	@Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt = LocalDateTime.now();

	// Many-to-one relationship with UserInfo
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "fk_resumes_user"))
	private UserInfo user;

	// One-to-one relationship with Negotiation
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "negotiation_id", unique = true, foreignKey = @ForeignKey(name = "fk_resumes_negotiation"))
	private Negotiation negotiation;
}
