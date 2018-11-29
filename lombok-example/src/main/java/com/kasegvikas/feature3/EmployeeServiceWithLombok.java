package com.kasegvikas.feature3;

import lombok.extern.log4j.Log4j;

@Log4j
public class EmployeeServiceWithLombok implements EmployeeService{

	@Override
	public void method1() {
		log.info("In method1 ");
	}

}
