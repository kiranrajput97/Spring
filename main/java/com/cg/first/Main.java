package com.cg.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	     Car objA = (Car) context.getBean("maruthi");

	      //objA.setPrice(20000);
	      objA.getPrice();

	      Car objB = (Car) context.getBean("maruthi");
	      objB.getPrice();

	}

}
