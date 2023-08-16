package com.demo.firstjdbc;

public class A {

	int id;
	String name;
	String sirname;
	String department;
	
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}


	public A(int id, String name, String sirname, String department) {
		super();
		this.id = id;
		this.name = name;
		this.sirname = sirname;
		this.department = department;
	}


	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + ", sirname=" + sirname + ", department=" + department + "]";
	}

	
	




}
