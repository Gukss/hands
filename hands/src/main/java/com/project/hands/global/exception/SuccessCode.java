package com.project.hands.global.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *packageName    : com.project.hands.global.exception
 * fileName       : SuccessCode
 * author         : dongk
 * date           : 2023-06-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-07        dongk       최초 생성
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public enum SuccessCode {
	SUCCESS(200, "요청에 성공했습니다.");
	private int code;
	private String message;
}
