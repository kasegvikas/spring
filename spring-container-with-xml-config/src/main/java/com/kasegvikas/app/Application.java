package com.kasegvikas.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import com.kasegvikas.model.ThingFive;
import com.kasegvikas.model.ThingFour;
import com.kasegvikas.model.ThingThree;
import com.kasegvikas.model.ThingTwo;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		ThingTwo thingTwo = (ThingTwo) context.getBean("thingTwo");
		Assert.notNull(thingTwo, "This bean must not be null.");
		System.out.println(thingTwo);

		ThingThree thingThree = (ThingThree) context.getBean("thingThree");
		Assert.notNull(thingThree, "This bean must not be null.");
		System.out.println(thingThree);

		ThingFour thingFour = (ThingFour) context.getBean("thingFour");
		Assert.notNull(thingFour, "This bean must not be null.");
		System.out.println(thingFour);

		ThingFive thingFive = (ThingFive) context.getBean("thingFive");
		Assert.notNull(thingFive, "This bean must not be null.");
		System.out.println(thingFive);
	}

}
