package com.nt.comp;

public class BlueDart implements Courier {

	@Override
	public String Orderid(int oid) {
		return oid+" Your odrder shipped by BlueDart Courier Service";
	}

}
