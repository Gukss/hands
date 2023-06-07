package com.project.hands.domain.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hands.domain.help.dto.CreateHelpRequest;
import com.project.hands.domain.user.dto.CreateUserRequest;
import com.project.hands.domain.user.service.UserService;
import com.project.hands.global.response.CommonResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 *packageName    : com.project.hands.domain.user.controller
 * fileName       : UserController
 * author         : dongk
 * date           : 2023-06-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-07        dongk       최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@Slf4j
public class UserController {

	private final UserService userService;

	@PostMapping
	public CommonResponse createUser(@RequestBody CreateUserRequest createUserRequest){
		long user = userService.createUser(createUserRequest);
		return CommonResponse.createSuccessCommonResponse();
	}
}
