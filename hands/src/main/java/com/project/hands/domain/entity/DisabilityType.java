package com.project.hands.domain.entity;

/**
 *packageName    : com.project.hands.domain.entity
 * fileName       : DisabilityType
 * author         : dongk
 * date           : 2023-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-05        dongk       최초 생성
 */
public enum DisabilityType {
	해당사항없음("해당사항없음"), 지체("지체"), 뇌병변("뇌병변"),
	시각("시각"), 청각("청각"), 언어("언어"),
	안면("안면"), 신장("신장"), 간("간"),
	호흡기("호흡기"), 장루("장루"), 뇌전증("뇌전증"),
	지적("지적"), 자폐성("자폐성"), 정신("정신");

	private String description;

	DisabilityType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
