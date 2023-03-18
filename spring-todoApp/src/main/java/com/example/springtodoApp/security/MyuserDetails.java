package com.example.springtodoApp.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.springtodoApp.entity.UserLogin;

public class MyuserDetails implements UserDetails {

	private String userName;
	private String password;
	private String roles;
	
	MyuserDetails(UserLogin login){
		this.userName=login.getUsername();
		this.password=login.getPassword();
		this.roles=login.getRoles();
		
		
	}
	
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(()->"read");
	}

	@Override
	public String getPassword() {
		return  this.password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return  this.userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
