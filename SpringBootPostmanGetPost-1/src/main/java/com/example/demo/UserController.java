package com.example.demo;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class UserController{
	@Autowired
	private UserService service;
	@GetMapping("/users")
	public List<User> retriveAllUser(){
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable int id)
	{
		return service.findOne(id);
	}
	
//	@PostMapping("/users")
//	public void createUser1(@RequestBody User User)
//	{
//		User savedUser=service.save(User);
//	}
	
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user)
	{
		User savedUser=service.save(user);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	
	
	
	
	@GetMapping(value="/getusers")
	private String getstudentValue()
	{
		String uri="http://localhost:8082/users";
		RestTemplate restTemplet=new RestTemplate();
		String result =restTemplet.getForObject(uri, String.class);
		return result;
	}
	
	
	
	
	
	
}
