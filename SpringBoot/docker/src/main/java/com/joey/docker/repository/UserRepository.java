package com.joey.docker.repository;

import com.joey.docker.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author EDZ
 */
public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
