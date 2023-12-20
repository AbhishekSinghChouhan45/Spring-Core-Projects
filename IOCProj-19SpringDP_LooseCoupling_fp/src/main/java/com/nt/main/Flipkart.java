package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.FlipkartFactory;

public class Flipkart {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		FlipkartFactory ff = ctx.getBean("flipkart",FlipkartFactory.class);
		String msg =ff.getCourier(new String []{"Jeans,Pants,Kurta"}, new double[] {8000,1000,250});
		 System.out.println(msg);
	}
}
