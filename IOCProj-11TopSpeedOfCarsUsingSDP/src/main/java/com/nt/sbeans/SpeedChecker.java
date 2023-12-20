package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sc")
public class SpeedChecker {
	@Autowired
	@Qualifier("mustang")
	private Speeds speed;
	
	public String checkSpeed(int acelerate) {
			return speed.speed(acelerate);
	}
}
