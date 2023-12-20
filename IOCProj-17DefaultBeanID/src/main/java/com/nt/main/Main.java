package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.MyClass;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		java.time.LocalDateTime m = ctx.getBean("java.time.LocalDateTime",java.time.LocalDateTime.class);
		java.time.LocalDateTime m1 = ctx.getBean("java.time.LocalDateTime#0",java.time.LocalDateTime.class);
//		java.time.LocalDateTime m2 = ctx.getBean("java.time.LocalDateTime#1",java.time.LocalDateTime.class);
//		java.time.LocalDateTime m3 = ctx.getBean("java.time.LocalDateTime#2",java.time.LocalDateTime.class);
//		java.time.LocalDateTime m4 = ctx.getBean("java.time.LocalDateTime#3",java.time.LocalDateTime.class);
		System.out.println(m.hashCode());
		System.out.println(m1.hashCode());
//		System.out.println(m2.hashCode());
//		System.out.println(m3.hashCode());
//		System.out.println(m4.hashCode());
	}

}
