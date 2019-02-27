package com.tabeldata.bootcamp.belajarspringboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kelas {
	@Autowired
	private String nama2;
	@Autowired
	private RandomString singletonString;
	@Autowired
	private RandomStringPrototype prototypeString;

	public String getNama() {
		return nama2;
	}

	public void setNama(String nama) {
		this.nama2 = nama;
	}
	
	@Override
    public String toString() {
        return String.format("singleton: %s , protoptype: %s", this.singletonString.getValue(), this.prototypeString.getValue());
    }
}
