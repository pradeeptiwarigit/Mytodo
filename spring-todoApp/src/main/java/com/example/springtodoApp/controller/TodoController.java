package com.example.springtodoApp.controller;

import java.security.Principal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.springtodoApp.entity.TodoFormData;
import com.example.springtodoApp.entity.UserLogin;
import com.example.springtodoApp.services.todoFormService;

@Controller
public class TodoController {
	
	@Autowired
	 private  todoFormService service;
	 String username="";
	@GetMapping("/home")
	public ModelAndView homePage(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		if (principal instanceof UserDetails) {
		  username = ((UserDetails)principal).getUsername();
		} else {
		  username = principal.toString();
		}
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.println("details of current login user"+auth.getDetails().toString());		
		
		System.out.println(auth.getPrincipal().toString());
	   
		
		List<TodoFormData> list=service.findAllRecords(username);
		
	System.out.println(Arrays.asList(list).toString());
	 String al = (String)model.asMap().get("al");
     System.out.println("al"+al);
	
	System.out.println("this is the value from other controller"+al);
		ModelAndView mv =new ModelAndView();
		mv.addObject("user",username);
		mv.addObject("detail",al);
		mv.addObject("Allrecord",list);
		mv.setViewName("todo-list");
		
		
		return mv;
		
	}
	@GetMapping("/todoform")
	public String getHome() {
		return "todo-form";
	}
	
	@GetMapping("/res")
	public String regPage() {
		return "Resgister";
	}
	
	
	
	@PostMapping("/pro")
	public String prologin() {
		
		
		System.out.println("inside prologin");
		
		return null;
	}
	
	
	@GetMapping("/login")
	public String getlogin() {
		return "login";
	}
	@GetMapping("/login-error")
	public String error()
	{
		return "login-error";
	}
	
	@PostMapping("/save")
	public String saveData(HttpServletRequest request, HttpServletResponse response,RedirectAttributes attributes) throws ParseException {
		
		String title = request.getParameter("title");
		System.out.println("printing "+title);
		String description = request.getParameter("description");
		
		/*DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-mm-dd");
		LocalDate targetDate = LocalDate.parse(request.getParameter("targetDate"),df);*/
	   System.out.println(request.getParameter("targetDate"));	;	
		boolean isDone = Boolean.valueOf(request.getParameter("isDone"));
		String date=request.getParameter("targetDate");
		
		
		
		System.out.println(title);
		DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		Date date1 = formatter.parse(date);
		
		System.out.println(description);
		System.out.println(isDone);
        
		TodoFormData data=new TodoFormData();
		data.setDate(date1);
		data.setTodo_desc(description);
		
		data.setTodo_title(title);
		data.setTodo_status(isDone);
		
		
		
		 service.todoFormSave(data,username);
		 attributes.addFlashAttribute("al", "al");
	
		 return "redirect:/home";
	
		
	}
	
	
	
	
}
