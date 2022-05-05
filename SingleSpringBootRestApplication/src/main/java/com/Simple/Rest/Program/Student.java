package com.Simple.Rest.Program;

import java.util.List;

public class Student {
	
	private int stuId;
	private String stuName;
	private String stuDept;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stuId, String stuName, String stuDept) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuDept() {
		return stuDept;
	}

	public void setStuDept(String stuDept) {
		this.stuDept = stuDept;
	}



	@Override
	public String toString() {
		return "StudentService [stuId=" + stuId + ", stuName=" + stuName + ", stuDept=" + stuDept + "]";
	}

//	public Student save(Student student) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<Student> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Student findOne(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	
	
	
	

}
