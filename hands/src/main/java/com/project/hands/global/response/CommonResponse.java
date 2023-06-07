package com.project.hands.global.response;

import com.project.hands.global.exception.SuccessCode;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *packageName    : com.project.hands.global.response
 * fileName       : CommonResponse
 * author         : dongk
 * date           : 2023-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-05        dongk       최초 생성
 */
@Getter
// @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class CommonResponse {


	private int code;
	private String message;

	public static CommonResponse createSuccessCommonResponse(){
		return CommonResponse.builder()
			.code(SuccessCode.SUCCESS.getCode())
			.message(SuccessCode.SUCCESS.getMessage())
			.build();
	}
}
