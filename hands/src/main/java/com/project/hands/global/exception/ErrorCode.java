package com.project.hands.global.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *packageName    : com.project.hands.global.exception
 * fileName       : ErrorCode
 * author         : dongk
 * date           : 2023-06-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-07        dongk       최초 생성
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public enum ErrorCode {
	DUPLICATE(401, "중복가입 입니다."),
	NO_TYPE(402, "없는 유형입니다."),
	ACCEPTED_REQUEST(403, "이미 수락한 요청입니다."),
	FORBIDDEN(404, "권한이 없습니다."),
	DELETED_REQUEST(405, "이미 삭제된 요청입니다."),
	COMPLETED_REQUEST(406, "완료된 요청입니다."),
	RATED(407, "이미 평점을 매긴 요청입니다."),
	UNAUTHORIZED(408, "토큰 인증 실패입니다."),
	DELETED_USER(409, "이미 삭제된 회원입니다."),
	INCONSISTENCY_OLD_PASSWORD(410, "기존 비밀번호가 일치하지 않습니다."),
	INCONSISTENCY_NEW_PASSWORD(411, "확인 비밀번호가 일치하지 않습니다."),
	NOT_FOUND_USER(412, "없는 유저입니다."),
	SERVER_ERROR(500, "서버에러 입니다.");

	private int code;
	private String message;
}
