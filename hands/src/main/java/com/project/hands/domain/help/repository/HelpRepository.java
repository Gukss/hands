package com.project.hands.domain.help.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hands.domain.entity.Help;

/**
 *packageName    : com.project.hands.domain.help.repository
 * fileName       : HelpRepository
 * author         : dongk
 * date           : 2023-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-05        dongk       최초 생성
 */
@Repository
public interface HelpRepository extends JpaRepository<Help, Long> {

}
