package com.graymatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graymatter.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUserName(String username);
	
	
}
