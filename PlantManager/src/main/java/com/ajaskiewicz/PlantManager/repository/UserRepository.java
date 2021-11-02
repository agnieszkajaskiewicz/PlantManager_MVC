package com.ajaskiewicz.PlantManager.repository;

import com.ajaskiewicz.PlantManager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findById(Integer id);

    User findByEmail(String email);

    User findByResetPasswordToken(String token);
}
