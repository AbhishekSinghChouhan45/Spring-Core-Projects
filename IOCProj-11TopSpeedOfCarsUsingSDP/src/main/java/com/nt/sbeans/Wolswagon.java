package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("wolswagon")
public class Wolswagon implements Speeds {
	@Override
	public String speed(int acelrate) {
		int speed = 120;
		return speed+" Top speed of Wolswagon and after aceleration speed is "+(acelrate+speed);
	}

}
