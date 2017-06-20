package com.nickbrown.springdemochallenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppChallenge2 {
	

	public static void main(String[] args) {
		// Create the application container context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
		
		// Create the bean
		City city = (City) ctx.getBean("cityBean");
		
		// Invoke the city name via the bean
		city.cityName();
		
		// Close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
