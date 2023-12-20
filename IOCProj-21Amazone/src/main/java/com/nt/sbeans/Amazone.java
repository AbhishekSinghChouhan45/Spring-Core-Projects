package com.nt.sbeans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("amazone")
public class Amazone {
	@Autowired
	@Qualifier("shipment")
	private Courier courier;
	@Value("${courier.pin}")
	private int pin;
	
	public String getCourier(String items[],double prices[]) {
		double amt=0.0;
		for(double price:prices) {
			amt = price+amt;
		}
		int oid = new Random().nextInt(1000);
		String msg1 = courier.getCourier(oid);
		double msg2 = courier.shipmentAmt(pin);
		String msg3 = courier.getCity(pin);
		return msg1+"you'r shipment address is: "+msg3+"\nYou'r total payable amount is "+(amt+msg2);
	}
}
