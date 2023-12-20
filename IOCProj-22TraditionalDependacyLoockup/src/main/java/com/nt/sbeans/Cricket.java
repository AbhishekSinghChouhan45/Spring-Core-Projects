package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cricket")
//@Lazy(true)
public class Cricket {
	public Cricket() {
		System.out.println("Cricket.Constructor");
	}
	public String bowling() {
		return "Bowler is Bowling";
	}
	public String fielding() {
		return "Fielder id fielding";
	}
	public String batting() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		CricketBat cb = ctx.getBean("cbat",CricketBat.class);
		return "Batter is batting and total runs are: "+cb.score();
	}
}
