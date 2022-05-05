package com.example.demo;

public class Person {
	private int id;
	private String name;
	private String sname ;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(int id, String name, String sname) {
		super();
		this.id = id;
		this.name = name;
		this.sname = sname;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	

}
