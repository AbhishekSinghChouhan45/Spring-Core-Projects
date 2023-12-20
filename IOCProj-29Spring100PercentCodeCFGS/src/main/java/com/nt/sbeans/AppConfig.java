package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com/nt")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig AppConfig()");
	}
	@Bean(name = "ldt")
	public LocalDateTime createDate() {
		System.out.println("AppConfig.createDate()");
		return LocalDateTime.now();
	}
		
}
