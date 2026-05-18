package com.codexa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codexa.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}