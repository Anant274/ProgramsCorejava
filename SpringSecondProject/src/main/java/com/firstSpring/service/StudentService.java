package com.firstSpring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.firstSpring.model.Course;
import com.firstSpring.model.Student;

public class StudentService {
	private static List<Student> students=new ArrayList<>();
	
	static {
		
		Course course1=new Course("Course1","Spring","10 Steps", Arrays.asList("Learn maven","Import project","First Example","Second Example"));
		
		Course course2=new Course("Course2","Spring","10 Steps", Arrays.asList("Learn maven","Import project","First Example","Second Example"));

		Student ranga = new Student("Student1", "Ranga Karanam",
				"Hiker, Programmer and Architect", new ArrayList<>(
						Arrays.asList(course1, course2)));
		
		students.add(ranga);
		
	}
	
	public Student retrieveStudent(String studentId)
	{
		for(Student student : students)
		{
			if(student.getId().equals(student)) {
				return student;
			}
		
		}
		return null;
	}
	public List<Course> retrieveCourses(String studentId){
		Student student=retrieveStudent(studentId);
		
		if(student==null)
		{
			return null;
		}
		return student.getCourse();
	}

}
