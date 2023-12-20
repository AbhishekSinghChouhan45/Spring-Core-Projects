package com.nt.bikemodels;

import com.nt.factory.Bike;
import com.nt.factory.Bullet;
import com.nt.factory.Electric;
import com.nt.factory.Sports;
import com.nt.factory.offroad;

public class BikeModels {

	public static Bike getBike(String bike) {
			if(bike.equalsIgnoreCase("bullet"))
				return new Bullet();
			else if(bike.equalsIgnoreCase("electric"))
				return new Electric();
			if(bike.equalsIgnoreCase("sports"))
				return new Sports();
			if(bike.equalsIgnoreCase("offroad"))
				return new offroad();
			else
				throw new IllegalArgumentException("No bike found");
	}

}
