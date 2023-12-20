package com.nt.sbeans;

public class ShipRocket implements Courier {
	@Override
	public String getCourier(int oid) {
			return oid+" your order is shipped by Ship Rocket courier services";
	}
}
