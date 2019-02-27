package com.tabeldata.bootcamp.belajarspringboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mahasiswa {
	public Mahasiswa() {
		
	}
	
	public Mahasiswa(String nama, Integer semester) {
		this.nama = nama;
		this.semester = semester;
	}
	
	
	
	private String nama;
	
	private Integer semester;
	@Autowired
	private Kelas kelas;
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
	
	@Override
    public String toString() {
        return String.format("nama: %s , semester: %s", this.nama, this.semester, this.kelas.getNama());
    }
}
