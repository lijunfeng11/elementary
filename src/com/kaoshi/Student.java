package com.kaoshi;

public class Student {

	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void  showSubjects() {
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}
