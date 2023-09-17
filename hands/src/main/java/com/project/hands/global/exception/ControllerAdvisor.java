package com.project.hands.global.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.project.hands.global.response.CommonResponse;

import lombok.RequiredArgsConstructor;

/**
 *packageName    : com.project.hands.global.exception
 * fileName       : ControllerAdvisor
 * author         : dongk
 * date           : 2023-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-06        dongk       최초 생성
 */
@RequiredArgsConstructor
@RestControllerAdvice
public class ControllerAdvisor {
	@ExceptionHandler(CustomException.class)
	public CommonResponse customExceptionHandler(CustomException e){
		return CommonResponse.createErrorCommonResponse(e.getErrorCode());
	}
}
