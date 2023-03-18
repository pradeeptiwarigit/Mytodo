package com.example.springtodoApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springtodoApp.entity.TodoFormData;
import com.example.springtodoApp.repo.TodoFormRepo;

public interface todoFormService {
	
	 public void  todoFormSave(TodoFormData todoFormData, String username );
	
	 public List<TodoFormData> findAllRecords(String username);

}
