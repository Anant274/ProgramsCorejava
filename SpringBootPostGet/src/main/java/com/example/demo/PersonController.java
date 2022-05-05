package com.example.demo;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	
//	@Autowired  
//	private Person service;  
//	
//	public List<Person> retriveAllUsers()  
//	{  
//	return service.findAll();  
//	}  
	
	
	@GetMapping("/person")
	public List<Person>  getAllPersons()
	{
		List<Person> per = new ArrayList<Person>();
		per.add(new Person(1,"name","mittal"));
		per.add(new Person(2,"kumar","pandey"));
		per.add(new Person(3,"ram","pandey"));
		
		return per;
	}
	
	@GetMapping("/person/{personId}")
	public Person getPersionWithId(@PathVariable Integer personId)
	{
		
		//return service.findOne(personId);  
		return new Person(3,"ram","pandey");
	}
	
	@PostMapping("person/newperson")
	
		public void addPerson(@RequestBody Person person) 
		{
		System.out.println("new person is addede");
		}	
}
