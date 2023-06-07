package com.project.hands.global.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *packageName    : com.project.hands.global.response
 * fileName       : DataResponse
 * author         : dongk
 * date           : 2023-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-05        dongk       최초 생성
 */
@Getter
@Setter
@NoArgsConstructor
public class DataResponse<T> extends CommonResponse{
	T data;
}
