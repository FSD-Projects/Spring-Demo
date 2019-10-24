package com.mycompany.spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			/*
			 * Coach tempCoach = context.getBean("theCoach", CricketCoach.class);
			 * System.out.println(tempCoach.getDailyWorkout());
			 */
			Customer customer = context.getBean("tempCustomer", Customer.class);
			System.out.println(customer);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
