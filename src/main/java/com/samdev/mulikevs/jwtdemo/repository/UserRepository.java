package com.samdev.mulikevs.jwtdemo.repository;

import com.samdev.mulikevs.jwtdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer>{


    User findByUsername(String username);
}
