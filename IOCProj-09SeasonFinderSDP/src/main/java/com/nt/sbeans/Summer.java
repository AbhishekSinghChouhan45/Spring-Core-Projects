package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("s")
public class Summer implements Seasons {

	@Override
	public String seasons(int season) {
		return "Between Feb  to May Summer Season ";
	}

}
