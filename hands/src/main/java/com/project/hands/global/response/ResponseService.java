package com.project.hands.global.response;

import org.springframework.stereotype.Service;

/**
 *packageName    : com.project.hands.global.response
 * fileName       : ResponseService
 * author         : dongk
 * date           : 2023-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-05        dongk       최초 생성
 */
@Service
public class ResponseService {
	public CommonResponse getSuccessResponse(){
		return CommonResponse.createSuccessCommonResponse();
	}
}
