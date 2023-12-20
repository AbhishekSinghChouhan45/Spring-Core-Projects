package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class MethodReplacerMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Flipkart ff = ctx.getBean("nd",Flipkart.class);
		System.out.println(ff.discount("RAJ"));
		System.out.println(ff.getClass());
		
	}

}
/*
	In Method Replacer the proxy class override the method of that class who implemented MethodRepladcer interface 
	Example:-
						12Sept paint brush containt
 
*/