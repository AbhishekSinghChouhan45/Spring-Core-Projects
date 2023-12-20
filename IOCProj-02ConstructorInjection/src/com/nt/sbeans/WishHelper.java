package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishHelper {
		
	private LocalDateTime dateTime;

	//Constructor Injection
	@Autowired
	public WishHelper(LocalDateTime dt) {
		System.out.println("WishHelper.WishHelper()");
		this.dateTime =dt;
	}
	
	//Genrating Message
	public String GenrateMessage(String name) {
			int hour = dateTime.getHour();
			if(hour<12)
				return "Good Morning "+name;
			else if(hour < 16)
				return "Good Afternoon "+name;
			else if(hour < 20)
				return "Good Evening "+name;
			else
				return "Good Night "+name;
	}
}
