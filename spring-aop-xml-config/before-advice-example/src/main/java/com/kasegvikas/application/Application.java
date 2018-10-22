package com.kasegvikas.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kasegvikas.service.SampleTargetService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SampleTargetService sampleTargetService = (SampleTargetService) context.getBean("sampleTargetService");
		sampleTargetService.sampleMethod();
	}
}
