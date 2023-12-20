package com.nt.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Amazone;

public class AmazoneMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Amazone am = ctx.getBean("amazone",Amazone.class);
		System.out.println(am.getCourier(new String [] {"Trouser,Shirt"}, new double[] {2000,900}));
		ctx.close();
	}
}
