package com.project.hands.domain.help.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.hands.domain.entity.Help;
import com.project.hands.domain.entity.User;
import com.project.hands.domain.help.dto.CreateHelpRequest;
import com.project.hands.domain.help.repository.HelpRepository;
import com.project.hands.domain.user.repository.UserRepository;
import com.project.hands.global.response.CommonResponse;

import lombok.RequiredArgsConstructor;

/**
 *packageName    : com.project.hands.domain.help.service
 * fileName       : HelpServiceImpl
 * author         : dongk
 * date           : 2023-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-05        dongk       최초 생성
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class HelpServiceImpl implements HelpService{

	private final HelpRepository helpRepository;
	private final UserRepository userRepository;

	@Override
	@Transactional(readOnly = false)
	public long createHelp(CreateHelpRequest createHelpRequest) {
		User user = userRepository.findById(1L).get(); //todo: 예외처리하기
		Help help = Help.create(user, createHelpRequest);
		Help save = helpRepository.save(help);
		return save.getId();
	}
}
