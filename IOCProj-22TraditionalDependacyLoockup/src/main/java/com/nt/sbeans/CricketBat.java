package com.nt.sbeans;

import java.util.Random;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("cbat")
//@Lazy(true)
public class CricketBat {
	public CricketBat() {
		System.out.println("CricketBat.Constructor");
	}
	public int score() {
		int runs = new Random().nextInt(150);
		return runs;
	}
}
