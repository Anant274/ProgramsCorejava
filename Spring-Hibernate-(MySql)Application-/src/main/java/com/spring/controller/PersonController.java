package com.spring.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.dao.PersonRepository;
import com.spring.entity.Person;


@Controller
public class PersonController {
	
	Logger logger=LoggerFactory.getLogger(PersonController.class);

	@Autowired
	private PersonRepository std;
	
	@GetMapping("/")
	public String mainPage(Model model)
	{
		logger.info("now request comming inside the(/Getmapping/student");
		
		model.addAttribute("student", new Person());
		
		logger.debug("student record is displayed");
		return "index";
	}
	
	@PostMapping("/register")
	public String registerPerson(Person person)
	{
		std.save(person);
		
		return"success";
	}
}
