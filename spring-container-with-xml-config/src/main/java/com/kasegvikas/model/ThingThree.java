package com.kasegvikas.model;

public class ThingThree {
	private String name;
	private int year;

	public ThingThree(String name, int year) {
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "ThingThree [name=" + name + ", year=" + year + "]";
	}
}
