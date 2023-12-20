package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.FlipkartFactory;

public class Flipkart {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		FlipkartFactory ff = ctx.getBean("flipkart",FlipkartFactory.class);
		System.out.println(ff.getService(new String[] {"Jeans,Shirts,Pants"},new  double[] {1000,800,900}));
		ctx.close();
	}
}
