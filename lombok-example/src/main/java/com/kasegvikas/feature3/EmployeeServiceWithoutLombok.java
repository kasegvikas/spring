package com.kasegvikas.feature3;

import org.apache.log4j.Logger;

public class EmployeeServiceWithoutLombok implements EmployeeService{

	private static final Logger logger = Logger.getLogger(EmployeeServiceWithoutLombok.class);
	@Override
	public void method1() {
		logger.info("In method1 ");
	}

}
