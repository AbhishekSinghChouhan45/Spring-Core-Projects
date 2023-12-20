package com.nt.sbeans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FlipkartFactory {
	@Autowired
	@Qualifier("service")
	private Courier courier;
	
	public String getService(String items[],double prices[]) {
		double amt = 0.0;
		for(double price:prices) {
			amt = price + amt;
		}
		int oid = new Random().nextInt(1000);
		String msg = courier.getCourier(oid);
		return msg+" Just chill buddy you'r total Bill amount is "+amt;
	}
}
