package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("w")
public class Winter implements Seasons {

	@Override
	public String seasons(int season) {
		return "Between nuvembor  to january Winter Season ";
	}

}
