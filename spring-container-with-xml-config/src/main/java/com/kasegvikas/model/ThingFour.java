package com.kasegvikas.model;

public class ThingFour {
	private String name;
	private int year;

	public ThingFour(String name, int year) {
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "ThingFour [name=" + name + ", year=" + year + "]";
	}
}
