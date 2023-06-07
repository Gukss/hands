package com.project.hands.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *packageName    : com.project.hands.global.entity
 * fileName       : User
 * author         : dongk
 * date           : 2023-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-05        dongk       최초 생성
 */
@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name="disability")
public class Disability {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="disability_id", nullable = false)
	private long id;

	@NotNull
	@Column(name="type", nullable = false)
	@Enumerated(EnumType.STRING)
	private DisabilityType type;

	@NotNull
	@Column(name = "caution",nullable = false, length = 1023)
	private String caution;

	public static Disability create(DisabilityType disabilityType){
		return Disability.builder()
			.type(disabilityType)
			.caution("temp") //todo: 어떻게 가지고 올 지 생각해보자
			.build();
	}
}
