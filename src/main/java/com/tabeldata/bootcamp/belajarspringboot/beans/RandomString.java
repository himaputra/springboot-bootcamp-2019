package com.tabeldata.bootcamp.belajarspringboot.beans;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class RandomString {
	private String value;
	
	public RandomString() {
		this.value = UUID.randomUUID().toString();
	}
	
	public String getValue() {
		return value;
	}
}
