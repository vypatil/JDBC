package com.demo.firstjdbc;

public class B {
	
	int id;
	String author_name;
	String publication;
	
	
	public B() {
		super();
		
	}
	public B(int id, String author_name, String publication) {
		super();
		this.id = id;
		this.author_name = author_name;
		this.publication = publication;
	}
	
	@Override
	public String toString() {
		return "B [id=" + id + ", author_name=" + author_name + ", publication=" + publication + "]";
	}
	
	
	
	
	

}
