package com.kasegvikas.feature2;

import java.util.Date;

public class EmployeeWithoutLombok {

	private String empId;
	private String firstName;
	private String lastname;
	private Date dob;
	private String phoneNo;

	public EmployeeWithoutLombok(String empId, String firstName,
			String lastname, Date dob, String phoneNo) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.dob = dob;
		this.phoneNo = phoneNo;
	}

	public static class EmployeeBuilder {
		private String empId;
		private String firstName;
		private String lastname;
		private Date dob;
		private String phoneNo;

		public EmployeeBuilder withEmpId(String empId) {
			this.empId = empId;
			return this;
		}

		public EmployeeBuilder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public EmployeeBuilder withLastName(String lastName) {
			this.lastname = lastName;
			return this;
		}

		public EmployeeBuilder withDob(Date dob) {
			this.dob = dob;
			return this;
		}

		public EmployeeBuilder withPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
			return this;
		}

		public EmployeeWithoutLombok build() {
			return new EmployeeWithoutLombok(empId, firstName, lastname, dob,
					phoneNo);
		}
	}

	@Override
	public String toString() {
		return "EmployeeWithoutLombok [empId=" + empId + ", firstName="
				+ firstName + ", lastname=" + lastname + ", dob=" + dob
				+ ", phoneNo=" + phoneNo + "]";
	}
}
