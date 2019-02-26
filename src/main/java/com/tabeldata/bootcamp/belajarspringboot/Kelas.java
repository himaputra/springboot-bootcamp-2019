package com.tabeldata.bootcamp.belajarspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kelas {
	
	@Value("Sistem Komputer")
	private String nama;

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
}
