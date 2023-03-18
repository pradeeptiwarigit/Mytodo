package com.example.springtodoApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springtodoApp.entity.TodoFormData;
import com.example.springtodoApp.entity.UserLogin;
import com.example.springtodoApp.repo.TodoFormRepo;

@Service
public class TodoFormServiceImpl implements todoFormService{

		@Autowired
	private  TodoFormRepo formRepo;
	
	

	@Override
	public void todoFormSave(TodoFormData todoFormData, String username) {
		Long id=formRepo.findUserId(username);
		System.out.println("id"+id);
		UserLogin userLogin =new UserLogin();
		userLogin.setUid(id);
		todoFormData.setLogin(userLogin);
		
		formRepo.save(todoFormData);
		
	}



	@Override
	public List<TodoFormData> findAllRecords(String username) {
	
		Long id=formRepo.findUserId(username);
	List<TodoFormData>	td=formRepo.findAllData(id);
		
		return td;
	}

}
