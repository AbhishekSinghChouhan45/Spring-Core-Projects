package com.nt.comp;

public class FirstFlight implements Courier {

	@Override
	public String Orderid(int oid) {
		return oid+" Your odrder shipped by FirstFlight Courier Service";
	}

}
