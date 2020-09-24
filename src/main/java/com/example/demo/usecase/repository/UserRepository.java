package com.example.demo.usecase.repository;

import java.util.Optional;

import com.example.demo.domain.users.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
