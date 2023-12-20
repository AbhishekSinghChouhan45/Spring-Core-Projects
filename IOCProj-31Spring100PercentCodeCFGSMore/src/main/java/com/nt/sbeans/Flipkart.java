package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
public class Flipkart {
	private static Flipkart flipkart;
	@Autowired
	private Flipkart() {
		System.out.println("Flipkart()");
	}
	private String name;
	@Value("${per.name}")
	public void setName(String name) {
	System.out.println("Flipkart...setName()");
		this.name = name;
	}
	
	@Autowired
	public static Flipkart getObj() {
		if(flipkart==null)
			flipkart = new Flipkart();
		return flipkart;
				
	}

}
