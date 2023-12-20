package com.flipkart.factory;
public class FirstFlight implements CourierServices {
	@Override
	public String getServiceName(int oid) {
			return oid+" Your courier shipped by FirstFlight courier services now fustion you'r seat belts.....";
	}

}
