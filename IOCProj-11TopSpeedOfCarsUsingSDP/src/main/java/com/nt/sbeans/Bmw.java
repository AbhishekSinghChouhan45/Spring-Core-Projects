package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bmw")
public class Bmw implements Speeds {
	@Override
	public String speed(int acelrate) {
		int speed = 150;
		return speed+" Top speed of BMW and after aceleration speed is "+(acelrate+speed);
	}

}
