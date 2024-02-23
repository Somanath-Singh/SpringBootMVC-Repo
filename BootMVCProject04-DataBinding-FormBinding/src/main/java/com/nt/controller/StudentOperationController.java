package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;


@Controller
public class StudentOperationController {
	
	@GetMapping("/")
	public String showHomePage() {
		//return LVN(home page->welcome page)
		return "welcome";
	}
	
	
	@GetMapping("/register")
	public String showStudentFormPage() {
		//return LVN(form page->register page)
		return "student_register";
	}
	
	@PostMapping("/register")
	public String registerStudent(Map<String,Object> map,@ModelAttribute("stud") Student st) {
		
		System.out.println(st);
		//return LVN
		return "show_result";
	}
	

}
