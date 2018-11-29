package com.kasegvikas.feature2;

import java.util.Date;

public class Application {

	public static void main(String[] args) {
		EmployeeWithoutLombok employee = new EmployeeWithoutLombok.EmployeeBuilder()
											.withEmpId("12345")
											.withFirstName("John")
											.withLastName("Kris")
											.withDob(new Date())
											.build();
		System.out.println(employee);
		
		EmployeeWithLombok employeeWithLombok = EmployeeWithLombok.builder()
											.empId("12345")
											.firstName("John")
											.lastname("Kris")
											.dob(new Date())
											.build();
		System.out.println(employeeWithLombok);
	}
}
