package com.example.springtodoApp.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springtodoApp.entity.UserLogin;
import com.example.springtodoApp.repo.UserLoginRepo;

@Service
public class UserSecirityConfig implements UserDetailsService{

	@Autowired
	UserLoginRepo user;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserLogin userLogin = user.findByUsername(username).get();
		System.out.println(userLogin.getUsername()+userLogin.getPassword()+userLogin.getRoles());
		
		MyuserDetails details=new MyuserDetails(userLogin);
		return details;
	}

}
