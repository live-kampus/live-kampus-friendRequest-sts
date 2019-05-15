package com.capgemini.signupservice.entity;

public class Friend {

	private String name;
	

	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Friend(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}
	
	
}
