package com.realworld.realworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserDAO extends JpaRepository<User, UUID> {
}
