package com.project.hands.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

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
@Table(name="help")
public class Help extends BaseTimeEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="help_id", nullable = false)
	private long id;

	@NotNull
	@Column(name = "context", length = 1023, nullable = false)
	private String context;

	@Column(name = "latitude", precision = 18, scale = 10, nullable = false)
	@Type(type = "big_decimal")
	private double latitude;

	@Column(name = "longitude", precision = 18, scale = 10, nullable = false)
	@Type(type = "big_decimal")
	private double longitude;

	@Column(name = "is_deleted", nullable = false)
	private boolean isDeleted;

	@Column(name = "is_rating", nullable = false)
	private boolean isRating;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "request_user_id", nullable = false)
	@NotNull
	private User requestUser;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "response_user_id", nullable = false)
	@NotNull
	private User responseUser;
}
