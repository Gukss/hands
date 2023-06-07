package com.project.hands.domain.user.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.hands.domain.disability.repository.DisabilityRepository;
import com.project.hands.domain.entity.Disability;
import com.project.hands.domain.entity.DisabilityType;
import com.project.hands.domain.entity.User;
import com.project.hands.domain.user.dto.CreateUserRequest;
import com.project.hands.domain.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 *packageName    : com.project.hands.domain.user.service
 * fileName       : UserServiceImpl
 * author         : dongk
 * date           : 2023-06-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-07        dongk       최초 생성
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Slf4j
public class UserServiceImpl implements UserService{

	private final UserRepository userRepository;
	private final DisabilityRepository disabilityRepository;

	@Override
	@Transactional
	public long createUser(CreateUserRequest createUserRequest) {
		//todo: 예외 만들기
		Disability disability = disabilityRepository.findByType(createUserRequest.getDisabilityType()).get();
		User user = User.create(createUserRequest, disability);
		User save = userRepository.save(user);
		return save.getId();
	}
}
