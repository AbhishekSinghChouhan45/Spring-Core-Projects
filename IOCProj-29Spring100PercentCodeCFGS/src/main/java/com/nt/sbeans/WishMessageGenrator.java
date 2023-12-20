package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenrator {
	private LocalDateTime time;
	@Autowired 
	public void setDate(LocalDateTime time) {
		System.out.println("WishMessageGenrator.setDate()");
		this.time = time;
	}
	
	public WishMessageGenrator() {
		System.out.println("WishMessageGenrator()");
	}
	public String wishMessage() {
		System.out.println("wishMessage()");
		int time = this.time.getHour();
		if(time < 12)
			return "Good Morning";
		else if(time < 16)
			return "Good Afternoon";
		else if(time < 20)
			return "Good Evening";
		else
			return "GoodNight";
	}
}
