package com.tabeldata.bootcamp.belajarspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.tabeldata.bootcamp.belajarspringboot.beans")
public class SpringConfig {
	@Bean
	public String nama1() {
		return "Configuration dari bean1";
	}
	
	@Bean
	public String nama2() {
		return "Configuration dari bean2";
	}

}
