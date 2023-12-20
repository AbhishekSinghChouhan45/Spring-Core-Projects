package com.nt.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com/nt")
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig()");
	}
}
