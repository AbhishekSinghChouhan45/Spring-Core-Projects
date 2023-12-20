package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("w")
public class Weather implements Seasons {
	@Override
	public String getSeason(int month) {
		if(month>12)
			return "Enter Valid Month";
		else
		if(month >= 2 && month <= 5)
			return "From Fabruary to May Summer Season";
		else if(month >=6 && month<=9)
			return "From Jun to Septamber Rainy Season";
		else
			return "From Octomber to January Winter Season";
	}

}
