package com.nt.comp;

public class ShipRocket implements Courier {

	@Override
	public String Orderid(int oid) {
		return oid+" Your odrder shipped by ShipRocket Courier Service";
	}

}
