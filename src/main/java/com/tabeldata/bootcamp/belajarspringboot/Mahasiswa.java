package com.tabeldata.bootcamp.belajarspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mahasiswa {
	
	@Value("Himawan Eka Putra")
	private String nama;
	@Value("8")
	private Integer semester;
	@Autowired
	private Kelas kelas;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public Integer getSemester() {
		return semester;
	}
	public void setSemester(Integer semester) {
		this.semester = semester;
	}
	public Kelas getKelas() {
		return kelas;
	}
	public void setKelas(Kelas kelas) {
		this.kelas = kelas;
	}
	
	
}
