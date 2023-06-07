package com.project.hands.domain.help.service;

import com.project.hands.domain.entity.Help;
import com.project.hands.domain.help.dto.CreateHelpRequest;
import com.project.hands.global.response.CommonResponse;

/**
 *packageName    : com.project.hands.domain.help.service
 * fileName       : HelpService
 * author         : dongk
 * date           : 2023-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-05        dongk       최초 생성
 */
public interface HelpService {
	long createHelp(CreateHelpRequest createHelpRequest);
}
