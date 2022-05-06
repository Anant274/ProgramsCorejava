package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentClass;

@RestController
public class StudentController {
	
	@Autowired
	StudentClass student;
	
	@GetMapping("/")
	public List<Student> getone()
	{
		List<Student> st=student.getdata();
		return st;
	}

}
