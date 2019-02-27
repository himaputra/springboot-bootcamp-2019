package com.tabeldata.bootcamp.belajarspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kelas {
	
	@Value("Sistem Komputer")
	private String nama;
	@Autowired
	private RandomString singletonString;
	@Autowired
	private RandomStringPrototype prototypeString;

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	@Override
    public String toString() {
        return String.format("singleton: %s , protoptype: %s", this.singletonString.getValue(), this.prototypeString.getValue());
    }
}
