package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class StudentService {
	
private static List<Student> student=new ArrayList<>();
	
	//private static int  userCount=3;
	
			static {
				student.add(new Student(1, "abc"));
				student.add(new Student(2, "pqr"));
				student.add(new Student(3, "xyz"));
			}
			
			public List<Student>findAll(){
				return student;
			}
			
			
			
}
