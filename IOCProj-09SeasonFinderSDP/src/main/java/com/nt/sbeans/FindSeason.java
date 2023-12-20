package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("fs")
public class FindSeason {
	@Autowired
	@Qualifier("s")
	Seasons seasons;
	public String checkSeason(int month) {
		if(month > 12)
			return "Enter Valid Month";
		else
			if(month >2 && month <5) {
			String msg = seasons.seasons(month);
				return msg;
			}
			else if(month >5 && month <9) {
				String msg = seasons.seasons(month);
				return msg;
			}
			else {
				String msg = seasons.seasons(month);
				return msg;
			}
	}
}
