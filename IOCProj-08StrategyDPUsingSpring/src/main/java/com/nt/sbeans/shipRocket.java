package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("SR")
public class shipRocket implements Courier{

	@Override
	public String deliver(int oid) {
		System.out.println("Step 3");
			return oid+" Your courier shipped by Ship Rocket courier services";
	}

}
