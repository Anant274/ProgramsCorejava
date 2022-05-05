package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentController {
	
	@Autowired
	StudentService student;
	@GetMapping(value="/studentinfo")
	public List<Student> st()
	
	{
		return student.findAll();
	}
	
	
	@GetMapping(value="/student")
	public Student getStudent()
	{
	return new Student(1,"anant");	
	}

	@GetMapping(value="/getstudentValue")
	private String getstudentValue()
	{
		String uri="http://localhost:8080/studentinfo";
		RestTemplate restTemplet=new RestTemplate();
		String result =restTemplet.getForObject(uri, String.class);
		return result;
	}
}
