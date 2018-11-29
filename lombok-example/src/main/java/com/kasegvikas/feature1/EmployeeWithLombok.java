package com.kasegvikas.feature1;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@NoArgsConstructor
public class EmployeeWithLombok {

	private @NonNull String empId;
	private @NonNull String firstName;
	private @NonNull String lastname;
	private @NonNull Date dob;
	private String phoneNo;
}
