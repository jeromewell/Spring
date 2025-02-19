package org.pay;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Restaurent {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		Gpay bean = context.getBean(Gpay.class);
		
		bean.bill();

	}
}
