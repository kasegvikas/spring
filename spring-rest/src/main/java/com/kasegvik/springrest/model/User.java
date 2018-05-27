package com.kasegvik.springrest.model;

public class User {

	private int id;
	private String firstname;
	private String lastName;

	public User() {
	}

	public User(int id, String firstname, String lastName) {
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
