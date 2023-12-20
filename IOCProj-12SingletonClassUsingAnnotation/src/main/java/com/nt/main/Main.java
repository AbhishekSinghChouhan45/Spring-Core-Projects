package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Parent;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Parent p = ctx.getBean("p",Parent.class);
		p.get();
		Parent p1 = ctx.getBean("p2",Parent.class);
		p1.get();
		System.out.println(p.hashCode()+" "+p1.hashCode());
		System.out.println(p==p1);
	}
}
