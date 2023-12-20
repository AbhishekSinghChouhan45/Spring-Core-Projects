package com.flipkart.factory;
public class ShipRocket implements CourierServices {
	@Override
	public String getServiceName(int oid) {
			return oid+" Your courier shipped by ShipRocket courier services now fustion you'r seat belts.....";
	}

}
