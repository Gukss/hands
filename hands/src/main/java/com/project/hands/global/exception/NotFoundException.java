package com.project.hands.global.exception;

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
public class NotFoundException extends RuntimeException{
	public NotFoundException() {
		super();
	}

	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotFoundException(Throwable cause) {
		super(cause);
	}
}
