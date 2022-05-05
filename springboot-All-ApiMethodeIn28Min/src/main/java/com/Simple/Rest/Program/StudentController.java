package com.Simple.Rest.Program;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {
	
	@Autowired
	private IStudent studentService;
	@GetMapping(value="/student")
	
	
	public List<Student> getMyStudentServices()
	{
		List<Student> service=studentService.findAll();
		return service;
		
	}



}
