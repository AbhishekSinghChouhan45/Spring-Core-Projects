package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("gp")
@PropertySource("com/nt/common/Info.properties")
public class GettingDataFromProperties {
	@Value("${per.name}")
	String name;
	@Value("${per.age}")
	String age ="78";
	@Value("${per.add}")
	String add;
	int a = Integer.parseInt(age);
	public int getAge() {
		return a;
	}
		public GettingDataFromProperties() {
			System.out.println("Creating Object Wait.....");
		}
	@Override
	public String toString() {
		return "Name of Person: "+name +"\n"+
				     "Age of Person: "+age +"\n"+
				    "Address of Person: "+add;
	}
}
