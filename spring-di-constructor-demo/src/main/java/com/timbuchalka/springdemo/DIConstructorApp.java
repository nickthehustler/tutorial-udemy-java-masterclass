package com.timbuchalka.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.timbuchalka.springdemo.domain.HumanResourceDept;
import com.timbuchalka.springdemo.domain.Organization;

public class DIConstructorApp {

	public static void main(String[] args) {
		// Create the application container context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
	
		// Create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		// Invoke the company slogan via the bean
		System.out.println(org.corporateSlogan());
		
		// Print organization details
//		System.out.println(org);
		
//		System.out.println(org.corporateService());
		HumanResourceDept hrdept = (HumanResourceDept) ctx.getBean("myhrdept");
		System.out.println(hrdept.hiringStatus(5500));
		
		// Close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
