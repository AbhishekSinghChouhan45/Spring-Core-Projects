package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.GettingDataFromProperties;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		GettingDataFromProperties gp = ctx.getBean("gp",GettingDataFromProperties.class);
		System.out.println(gp);
		GettingDataFromProperties gp1=gp;
		
		System.out.println("int Age "+gp1.getAge());
		
		ctx.close();
	}

}
