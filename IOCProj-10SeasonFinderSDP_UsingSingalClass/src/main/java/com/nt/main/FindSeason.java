package com.nt.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.nt.sbeans.Weather;
@Component("fs")
public class FindSeason {
	@Autowired
	@Qualifier("w")
	private Weather wether;
	 public String  getSea(int month) {
		String msg = wether.getSeason(month);
		return msg;
	}
	 public static void main(String[] args) {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext.xml");
		FindSeason fs = cp.getBean("fs",FindSeason.class);
		String gm = fs.getSea(1);
		System.out.println(gm);
	}
}
