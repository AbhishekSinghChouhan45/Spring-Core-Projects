package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("r")
public class Rainy implements Seasons {

	@Override
	public String seasons(int season) {
		return "Between July to oct Rainy Season ";
	}

}
