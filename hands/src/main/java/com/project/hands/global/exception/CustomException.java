package com.project.hands.global.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *packageName    : com.project.hands.global.exception
 * fileName       : NotFoundException
 * author         : dongk
 * date           : 2023-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-06        dongk       최초 생성
 */
@Getter
@AllArgsConstructor
public class CustomException extends RuntimeException{
	ErrorCode errorCode;
	public CustomException() {
		super();
	}

	public CustomException(String message) {
		super(message);
	}

	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomException(Throwable cause) {
		super(cause);
	}
}
