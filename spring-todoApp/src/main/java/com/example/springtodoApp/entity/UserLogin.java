package com.example.springtodoApp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name =  "user_login")
public class UserLogin {
	@GeneratedValue
	@Id
	@Column(name = "uid")
     private long uid;
	
	
     private String username;
	
	@Column(name = "password")
     private String password;
	
	@Column(name = "roles")
     private String roles;
  
	public long getUid() {
		return uid;
	}


	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
     

}
