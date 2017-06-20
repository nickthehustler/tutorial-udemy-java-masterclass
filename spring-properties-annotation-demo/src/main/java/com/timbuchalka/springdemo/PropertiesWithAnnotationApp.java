package com.timbuchalka.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.timbuchalka.springdemo.domain.promotion.TradeFair;

public class PropertiesWithAnnotationApp {

	public static void main(String[] args) {
		// Create the application container context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		TradeFair tradeFair = (TradeFair)ctx.getBean("myFair");
		
		System.out.println(tradeFair.specialPromotionalPricing());
		
		// Close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
