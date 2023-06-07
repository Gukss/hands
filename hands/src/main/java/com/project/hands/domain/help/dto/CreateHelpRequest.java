package com.project.hands.domain.help.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *packageName    : com.project.hands.domain.help.dto
 * fileName       : CreateHelpRequest
 * author         : dongk
 * date           : 2023-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-05        dongk       최초 생성
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@AllArgsConstructor
@Builder
public class CreateHelpRequest {
	private String context;

	@NotNull
	private BigDecimal latitude; //고정소수점 위해 BigDecimal 사용

	@NotNull
	private BigDecimal longitude;
}
