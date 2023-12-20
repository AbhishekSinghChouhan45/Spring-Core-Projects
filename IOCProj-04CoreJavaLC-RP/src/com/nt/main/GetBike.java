package com.nt.main;

import com.nt.bikemodels.BikeModels;
import com.nt.factory.Bike;

public class GetBike {
	public static void main(String[] args) {

		Bike bike = BikeModels.getBike("electric");
		Bike bike1 = BikeModels.getBike("sports");
		System.out.println(bike.hashCode());
		bike.drive();
		bike1.drive();
		System.out.println(bike.getClass());
	}

}
