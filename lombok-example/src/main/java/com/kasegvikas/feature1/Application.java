package com.kasegvikas.feature1;

import java.util.Date;

public class Application {

	public static void main(String[] args) {
		EmployeeWithoutLombok employeeWithoutLombok = new EmployeeWithoutLombok("12345", "John", "Kris", new Date());
		EmployeeWithLombok employeeWithLombok = new EmployeeWithLombok("12345", "John", "Kris", new Date());
		
		System.out.println("employeeWithoutLombok :: " + employeeWithoutLombok);
		System.out.println("employeeWithLombok :: " + employeeWithLombok);
	}
}
