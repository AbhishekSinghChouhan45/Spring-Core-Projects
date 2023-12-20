package com.nt.factory;

public class Electric implements Bike {
	static {
		System.out.println("IONS");
	}
	@Override
	public void drive() {
		System.out.println("ElectricBike.drive()");
	}
	

}
