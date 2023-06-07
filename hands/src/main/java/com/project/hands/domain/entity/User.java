package com.project.hands.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.project.hands.domain.user.dto.CreateUserRequest;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *packageName    : com.project.hands.global.entity
 * fileName       : User
 * author         : dongk
 * date           : 2023-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-05        dongk       최초 생성
 */
@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name="user")
public class User extends BaseTimeEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id", nullable = false)
	private long id;

	@NotNull
	@Column(name = "email", length = 255, nullable = false)
	private String email;

	@NotNull
	@Column(name = "password", length = 255, nullable = false)
	private String password;

	@NotNull
	@Column(name = "name", length = 255, nullable = false)
	private String name;

	@Column(name = "is_deleted", nullable = false)
	private boolean isDeleted;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "disability_id", nullable = false)
	@NotNull
	private Disability disability;

	public static User create(CreateUserRequest createUserRequest, Disability disability){
		return User.builder()
			.email(createUserRequest.getEmail())
			.password(createUserRequest.getPassword())
			.name(createUserRequest.getName())
			.isDeleted(false)
			.disability(disability)
			.build();
	}
}
