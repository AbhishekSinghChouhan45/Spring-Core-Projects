package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("firstFlight")
public class FirstFlight implements Courier{

	@Override
	public String getOid(int oid) {
		return oid+" Your order is shipped by First Flight Courier Services";
	}

	@Override
	public int getDcharge() {
		return 70;
	}
	
}
