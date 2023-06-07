package com.project.hands.domain.help.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hands.domain.help.dto.CreateHelpRequest;
import com.project.hands.domain.help.service.HelpService;
import com.project.hands.global.response.CommonResponse;

import lombok.RequiredArgsConstructor;

/**
 *packageName    : com.project.hands.domain.help.controller
 * fileName       : HelpController
 * author         : dongk
 * date           : 2023-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-05        dongk       최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/help")
public class HelpController {

	private final HelpService helpService;

	@PostMapping
	public CommonResponse createHelp(CreateHelpRequest createHelpRequest){
		long help = helpService.createHelp(createHelpRequest);
		return null;
	}
}
