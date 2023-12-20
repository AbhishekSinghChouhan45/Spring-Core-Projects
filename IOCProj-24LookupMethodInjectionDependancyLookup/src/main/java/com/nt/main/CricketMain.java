package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricket;

public class CricketMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Cricket ck = ctx.getBean("cricket",Cricket.class);
		System.out.println(ck.bowling());
		System.out.println(ck.fielding());
		System.out.println(ck.batting());
	}
}
