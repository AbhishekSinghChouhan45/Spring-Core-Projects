package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("FF")
public class firstFlight implements Courier{

	@Override
	public String deliver(int oid) {
			return oid+" Your courier shipped by FirstFlight courier services";
	}

}
