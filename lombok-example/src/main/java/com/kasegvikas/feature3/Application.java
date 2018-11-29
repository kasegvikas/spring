package com.kasegvikas.feature3;

public class Application {

	public static void main(String[] args) {
		EmployeeService employeeServiceWithLombok = new EmployeeServiceWithLombok();
		employeeServiceWithLombok.method1();
		
		EmployeeService employeeServiceWithoutLombok = new EmployeeServiceWithoutLombok();
		employeeServiceWithoutLombok.method1();
	}
}
