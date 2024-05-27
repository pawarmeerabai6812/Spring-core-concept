package com.springCore.SpringCore0.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/SpringCore0/AOP/NewFile.xml");
	PaymentService paymentobj=context.getBean("payment",PaymentService.class);
	//autheticate print:PaymentStarted	
	paymentobj.makePayment();
	
	}

}
