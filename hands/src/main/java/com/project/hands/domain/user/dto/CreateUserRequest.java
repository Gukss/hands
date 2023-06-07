package com.project.hands.domain.user.dto;

import javax.validation.constraints.NotNull;

import com.project.hands.domain.entity.DisabilityType;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *packageName    : com.project.hands.domain.user.dto
 * fileName       : CreateUserRequest
 * author         : dongk
 * date           : 2023-06-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-07        dongk       최초 생성
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@AllArgsConstructor
@Builder
public class CreateUserRequest {
	@NotNull
	private String email;

	@NotNull
	private String password;

	@NotNull
	private String name;

	@NotNull
	private DisabilityType disabilityType;
}
