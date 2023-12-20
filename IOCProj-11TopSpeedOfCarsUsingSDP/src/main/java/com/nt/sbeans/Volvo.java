package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("volvo")
public class Volvo implements Speeds {
	@Override
	public String speed(int acelrate) {
		int speed = 140;
		return speed+" Top speed of Volvo and after aceleration speed is "+(acelrate+speed);
	}

}
