package com.kasegvikas.feature2;

import java.util.Date;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class EmployeeWithLombok {

	private String empId;
	private String firstName;
	private String lastname;
	private Date dob;
	private String phoneNo;
}
