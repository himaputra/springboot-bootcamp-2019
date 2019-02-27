package com.tabeldata.bootcamp.belajarspringboot;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RandomStringPrototype {
private String value;
	
	public RandomStringPrototype() {
		this.value = UUID.randomUUID().toString();
	}
	
	public String getValue() {
		return value;
	}
}
