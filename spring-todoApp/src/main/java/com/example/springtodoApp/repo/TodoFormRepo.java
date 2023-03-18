package com.example.springtodoApp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.springtodoApp.entity.TodoFormData;

public interface TodoFormRepo extends JpaRepository<TodoFormData, Long>{

	@Query(
			  value = "SELECT uid  FROM user_login   WHERE username = :user", 
			  nativeQuery = true)
	
	Long findUserId(@Param ("user") String user);

	@Query(
			  value = "SELECT *  FROM todo_form_data   WHERE user_id = :user", 
			  nativeQuery = true)
	
	List<TodoFormData> findAllData(@Param ("user") Long user);

}
