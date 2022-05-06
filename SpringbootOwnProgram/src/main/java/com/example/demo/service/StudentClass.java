package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public class StudentClass {
	
	public List<Student> getdata()
	{
		List<Student> st=new ArrayList<Student>();
		st.add(new Student(1,"anant","kumar"));
		st.add(new Student(2,"kumarr","pandey"));
		st.add(new Student(3,"pandey","ramganesh"));
		
		return st;
	}

}
