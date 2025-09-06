package ru.brobrocode.cadra.dto;

import jakarta.persistence.Column;
import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
public class User {
	private String id;
	private String hhId;
	private String firstName;
	private String lastName;
	private String middleName;
	private String phoneNumber;
	private String email;
	private String role;
	private String authorities;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
