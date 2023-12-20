package com.flipkart.factory;
public class Flipkart {
		public static FlipkartFactory getObj(String ctype) {
				CourierServices cs;
					if(ctype.equalsIgnoreCase("dtdc"))
						cs = new DTDC();
					else if(ctype.equalsIgnoreCase("firstflight"))
						cs = new FirstFlight();
					else if(ctype.equalsIgnoreCase("shiprocket"))
						cs = new ShipRocket();
					else if(ctype.equalsIgnoreCase("bluedart"))
						cs = new BlueDart();
					else
						throw new IllegalArgumentException("No Courier found name of "+ctype);
					
					FlipkartFactory ff = new FlipkartFactory();
					ff.setCourier(cs);
					return ff;
					
		}
}
