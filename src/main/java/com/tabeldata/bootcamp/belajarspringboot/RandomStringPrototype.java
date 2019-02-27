package com.tabeldata.bootcamp.belajarspringboot;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ScopedProxyMode;

@Component
@Scope(value="prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RandomStringPrototype {
private String value;
	
	public RandomStringPrototype() {
		this.value = UUID.randomUUID().toString();
	}
	
	public String getValue() {
		return value;
	}
}
