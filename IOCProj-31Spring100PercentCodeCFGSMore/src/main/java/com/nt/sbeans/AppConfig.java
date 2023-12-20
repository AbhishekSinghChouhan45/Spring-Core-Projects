package com.nt.sbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com/nt")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig()");
	}
	@Bean(name = "f")
	public Flipkart flip() {
		System.out.println("flip()");
		return Flipkart.getObj();
	}
	@Bean(name = "ff")
	public Flipkart flipk() {
		System.out.println("flip()2");
		return Flipkart.getObj();
	}
	@Bean(name = "aa")
	public Amazone ama() {
		return new Amazone();
	}
	@Bean(name = "fff")
	public Flipkart flipkk() {
		System.out.println("flip()2");
		return Flipkart.getObj();
	}
}
