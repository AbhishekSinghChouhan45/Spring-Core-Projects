package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("DTDC")
public class DTDC implements Courier{

	@Override
	public String deliver(int oid) {
		return oid+"Your courier shipped by DTDC courier services";
		}

}
