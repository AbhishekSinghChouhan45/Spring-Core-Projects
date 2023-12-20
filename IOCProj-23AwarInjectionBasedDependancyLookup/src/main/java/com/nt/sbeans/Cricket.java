package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component("cricket")
public class Cricket implements ApplicationContextAware {
	public Cricket() {
		System.out.println("Cricket Constructor");
	}
	private ApplicationContext ac;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Cricket.setApplicationContext()");
		System.out.println(applicationContext.hashCode()+" ac");
		this.ac = applicationContext;
	}
	public String bowling() {
		return "Bowler is Bowling";
	}
	public String fielding() {
		return "Fielder is fielding";
	}
	public String batting() {
		CricketBat ck = ac.getBean("cbat",CricketBat.class);
		return "Batter is batting and total runs are: "+ck.runs();
	}

}
