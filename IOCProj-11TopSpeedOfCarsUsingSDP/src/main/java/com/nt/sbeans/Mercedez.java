package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("benz")
public class Mercedez implements Speeds {
	@Override
	public String speed(int acelrate) {
		int speed = 160;
		return speed+" Top speed of Mercedez Benz and after aceleration speed is "+(acelrate+speed);
	}

}
