package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SpeedChecker;

public class SpeedMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPath = new ClassPathXmlApplicationContext("applicationContext.xml");
		SpeedChecker speedChecker = classPath.getBean("sc",SpeedChecker.class);
		System.out.println(speedChecker.checkSpeed(20));
	}
}
