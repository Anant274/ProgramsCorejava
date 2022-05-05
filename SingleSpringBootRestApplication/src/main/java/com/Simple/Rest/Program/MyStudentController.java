package com.Simple.Rest.Program;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class MyStudentController {

	@Autowired
	private StudentDet service;
	
	
	

	@GetMapping(value="/student")
	public List<Student> retriveAllUser()
	{
		List<Student> service1=service.findAll();  
		return service1;
	}
	
	//@GetMapping("/student/{id}")
	//public List<Student> getMyStudentServiceId()
	//{
		//List<Student> service=studentService.findOne1();
		//return service;
	//}

	////////////////////////////////////////////////////////////////////////////////
	
//	@Autowired  
//	public Student service;  
//	 
//	//retrieves a specific user detail  
//	@GetMapping("/student/{id}")  
//	public Student retriveUser(@PathVariable int id)  
//	{  
//	return service.findOne(id);  
//	}  
//	//method that posts a new user detail   
//	  
//	}  
	
}
	
	

	

