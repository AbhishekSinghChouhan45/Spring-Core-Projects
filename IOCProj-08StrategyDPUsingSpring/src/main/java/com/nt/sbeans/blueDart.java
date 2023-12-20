package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("BD")
public class blueDart implements Courier{

	@Override
	public String deliver(int oid) {
			return oid+"Your courier shipped by BlueDart courier services";
	}

}
