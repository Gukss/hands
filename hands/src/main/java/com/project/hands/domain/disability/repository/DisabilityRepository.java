package com.project.hands.domain.disability.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hands.domain.entity.Disability;
import com.project.hands.domain.entity.DisabilityType;
import com.project.hands.domain.entity.User;

/**
 *packageName    : com.project.hands.domain.disability.repository
 * fileName       : DisabilityRepository
 * author         : dongk
 * date           : 2023-06-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-07        dongk       최초 생성
 */
@Repository
public interface DisabilityRepository extends JpaRepository<Disability, Long> {
	Optional<Disability> findByType(DisabilityType disabilityType);
}
