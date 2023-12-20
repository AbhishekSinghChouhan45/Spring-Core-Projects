package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("mustang")
public class Mustang implements Speeds {
	@Override
	public String speed(int acelrate) {
		int speed = 190;
		return speed+" Top speed of Mustang GT and after aceleration speed is "+(acelrate+speed);
	}

}
