package com.nt.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component("cbat")
public class CricketBat {
	public int bat() {
		return new Random().nextInt(140);
	}
}
