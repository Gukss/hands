package com.project.hands.domain.user.service;

import com.project.hands.domain.user.dto.CreateUserRequest;

/**
 *packageName    : com.project.hands.domain.user.service
 * fileName       : UserService
 * author         : dongk
 * date           : 2023-06-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-07        dongk       최초 생성
 */
public interface UserService {
	long createUser(CreateUserRequest createUserRequest);
}
