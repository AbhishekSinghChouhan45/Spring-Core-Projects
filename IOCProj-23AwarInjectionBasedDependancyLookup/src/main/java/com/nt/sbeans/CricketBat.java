package com.nt.sbeans;

import java.util.Random;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component("cbat")
public class CricketBat {
	public CricketBat() {
		System.out.println("CricketBat Cons");
	}
	public int runs() {
		return new Random().nextInt(150);
	}
	
}
