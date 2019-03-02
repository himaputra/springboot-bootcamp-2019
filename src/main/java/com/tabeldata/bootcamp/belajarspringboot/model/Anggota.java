package com.tabeldata.bootcamp.belajarspringboot.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Anggota {
	private String id;
	private String nama;
	private Date ttl;
	private String jenisKelamin;
	private String alamat;
	private String agama;
	private Date berlaku;
	private Timestamp createdDate;
	private String createdBy;
	private Timestamp lastUpdatedDate;
	private String lastUpdatedBy;
	
	public String toString() {
		return String.format(
				"{ID: %s, Nama: %s, Tanggal lahir: %s, Jenis Kelamin: %s, Alamat: %s, Agama: %s, Berlaku: %s, Created Date: %s, Created By: %s, Last Updated Date: %s, Last Updated By: %s}", 
				this.id, this.nama, this.ttl, this.jenisKelamin, this.alamat, this.agama, this.berlaku, this.createdDate, this.createdBy, this.lastUpdatedDate, this.lastUpdatedBy
				);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Date getTtl() {
		return ttl;
	}

	public void setTtl(Date ttl) {
		this.ttl = ttl;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getAgama() {
		return agama;
	}

	public void setAgama(String agama) {
		this.agama = agama;
	}

	public Date getBerlaku() {
		return berlaku;
	}

	public void setBerlaku(Date berlaku) {
		this.berlaku = berlaku;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
}
