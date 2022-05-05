package com.firstSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.firstSpring.model.Course;
import com.firstSpring.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student/{studentId}/courses")
	public List<Course> retrieveCoursesForStudent(@PathVariable String studentId)
	{
		return studentService.retrieveCourses(studentId);
		
	}
	

}
