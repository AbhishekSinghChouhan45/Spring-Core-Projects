package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Parent;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Parent p = ctx.getBean("p1",Parent.class);
		Parent p1 = ctx.getBean("p2",Parent.class);
		System.out.println(p.hashCode()+" "+p1.hashCode());
		System.out.println(p==p1);
	}
}
