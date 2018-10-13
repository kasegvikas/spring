package com.kasegvikas.model;

import java.beans.ConstructorProperties;

public class ThingFive {
	private String name;
	private int year;

	@ConstructorProperties({"nameProp","yearProp"})
	public ThingFive(String name, int year) {
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "ThingFive [name=" + name + ", year=" + year + "]";
	}
}
