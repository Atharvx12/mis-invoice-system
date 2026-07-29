package com.misinvoice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.misinvoice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}
