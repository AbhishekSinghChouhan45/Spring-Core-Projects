package com.nt.sbeans;

public class BlueDart implements Courier {
	@Override
	public String getCourier(int oid) {
			return oid+" your order is shipped by Blue Dart courier services";
	}

}
