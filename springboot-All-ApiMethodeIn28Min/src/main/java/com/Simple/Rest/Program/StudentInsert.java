package com.Simple.Rest.Program;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class StudentInsert implements IStudent  {
	@Override
	public List<Student> findAll()
	{
		ArrayList<Student> ser=new ArrayList<Student>();
		ser.add(new Student(1,"anant","mca"));
		ser.add(new Student(1,"kumar","bca"));
		ser.add(new Student(3,"pandey","ma"));
		
		return ser;
	}
}
