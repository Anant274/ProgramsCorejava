package com.Simple.Rest.Program;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class StudentInsert implements StudentDet  {
	@Override
	public List<Student> findAll()
	{
		ArrayList<Student> ser=new ArrayList< Student>();
		ser.add(new Student(1,"anant","mca"));
		ser.add(new Student(2,"kumar","bca"));
		ser.add(new Student(3,"pandey","ma"));
		
		return ser;
	}
	
	
	
	
	public List<Student> findOne1()
	{
		ArrayList<Student> ser1=new ArrayList< Student>();
		ser1.add(new Student(1,"anant","mca"));
		ser1.add(new Student(2,"kumar","bca"));
		ser1.add(new Student(3,"pandey","ma"));
		
		return ser1;
	
	}
}

