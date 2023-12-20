package com.flipkart.factory;

import java.util.Random;

public class FlipkartFactory {
	private CourierServices cs;
	public void setCourier(CourierServices cs) {
		this.cs = cs;
	}
	public  String getCourierName(String []items,double []prices) {
			Double amt =0.0;
			for(Double amts:prices ) {
				amt = amts + amt;
			}
			int oid = new  Random().nextInt(1000);
			String msg = cs.getServiceName(oid);
			return msg+" and your total paybal amount is: "+amt;
	}
}	
