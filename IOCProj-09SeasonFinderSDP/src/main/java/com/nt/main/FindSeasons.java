package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.FindSeason;

public class FindSeasons {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext.xml");
		FindSeason fs = cp.getBean("fs", FindSeason.class);
		System.out.println(fs.checkSeason(2));
	}
}
