package com.tabeldata.bootcamp.belajarspringboot;

public class Mahasiswa {
	
	
	public Mahasiswa(String nama, Integer semester, Kelas kelas) {
		this.nama = nama;
		this.semester = semester;
		this.kelas = kelas;
	}
	private String nama;
	private Integer semester;
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
