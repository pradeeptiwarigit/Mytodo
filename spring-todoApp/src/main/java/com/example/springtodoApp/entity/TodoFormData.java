package com.example.springtodoApp.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
@Entity
public class TodoFormData {
	@Id
	@GeneratedValue
	private long todo_id;
	private String todo_title;
	private String todo_desc;
	private boolean todo_status;
	private Date date;
	
	@ManyToOne(
		cascade = CascadeType.MERGE	
		
			)
	@JoinColumn(
			name = "user_id",
			referencedColumnName = "uid"
			)
    private UserLogin login;	 
	
	public UserLogin getLogin() {
		return login;
	}
	public void setLogin(UserLogin login) {
		this.login = login;
	}
	public long getTodo_id() {
		return todo_id;
	}
	public void setTodo_id(long todo_id) {
		this.todo_id = todo_id;
	}
	public String getTodo_title() {
		return todo_title;
	}
	public void setTodo_title(String todo_title) {
		this.todo_title = todo_title;
	}
	public String getTodo_desc() {
		return todo_desc;
	}
	public void setTodo_desc(String todo_desc) {
		this.todo_desc = todo_desc;
	}
	public boolean isTodo_status() {
		return todo_status;
	}
	public void setTodo_status(boolean todo_status) {
		this.todo_status = todo_status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	} 
	
	
	
}
