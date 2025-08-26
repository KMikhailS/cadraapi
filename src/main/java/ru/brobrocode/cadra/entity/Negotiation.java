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

import java.time.LocalDateTime;

@Entity
@Table(name = "negotiations")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "resume")
@EqualsAndHashCode(exclude = "resume")
public class Negotiation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "negotiation_seq")
	@SequenceGenerator(name = "negotiation_seq", sequenceName = "cdr_negotiations", allocationSize = 1)
	@Column(name = "id")
	private Long id;

	@Column(name = "total_responses", nullable = false)
	private Integer totalResponses;

	@Column(name = "successful_responses", nullable = false)
	private Integer successfulResponses;

	@Column(name = "failed_responses", nullable = false)
	private Integer failedResponses;

	@Column(name = "invitations_count", nullable = false)
	private Integer invitationsCount;

	@Column(name = "created_at", nullable = false)
	@CreatedDate
	private LocalDateTime createdAt = LocalDateTime.now();

	@Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt = LocalDateTime.now();

	// One-to-one relationship with Resume
	@OneToOne(mappedBy = "negotiation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Resume resume;
}
