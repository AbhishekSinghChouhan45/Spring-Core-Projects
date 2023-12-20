package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("shipRocket")
public class ShipRocket implements Courier{

	@Override
	public String getOid(int oid) {
		return oid+" Your order is shipped by Ship Rocket Courier Services";
	}

	@Override
	public int getDcharge() {
		return 80;
	}
	
}
