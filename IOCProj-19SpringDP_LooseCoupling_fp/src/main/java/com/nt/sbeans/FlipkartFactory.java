package com.nt.sbeans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("flipkart")
public class FlipkartFactory {
	@Autowired
	@Qualifier("courier")
	public Courier courier;
	
	public String getCourier(String items[],double prices[]) {
		double amt =0.0;
		String it=null;
		for(double price:prices) {
			amt = amt+price;
		}
		for(String  item:items) {
			it = item;
		}
		int oid = new Random().nextInt(1000);
		String msg = courier.getOid(oid);
		return msg+" your orders are "+it+" \nTotal Bill Amout is"+amt;
	}
}
