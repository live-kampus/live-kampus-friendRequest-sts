package com.capgemini.signupservice.entity;

public class PendingFriendRequest {
	
	private String name;

	public PendingFriendRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PendingFriendRequest(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "PendingFriendRequest [name=" + name + "]";
	}
	
	

}
