package com.example.demo;

 class User {
	private Integer id;
	private String name;
	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	protected User() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

}
