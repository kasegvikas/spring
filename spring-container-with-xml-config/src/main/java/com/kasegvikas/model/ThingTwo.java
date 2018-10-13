package com.kasegvikas.model;

public class ThingTwo {
	private String name;
	private int year;

	public ThingTwo(String name, int year) {
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "ThingTwo [name=" + name + ", year=" + year + "]";
	}
}
