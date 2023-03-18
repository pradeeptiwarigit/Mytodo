package com.example.springtodoApp.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtodoApp.entity.UserLogin;
@Repository
public interface UserLoginRepo extends JpaRepository<UserLogin, Long> {
	
	    Optional<UserLogin> findByUsername(String name);

}
