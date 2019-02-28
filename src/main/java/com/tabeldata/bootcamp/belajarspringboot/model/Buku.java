package com.tabeldata.bootcamp.belajarspringboot.model;

import java.sql.Timestamp;

public class Buku {
	private String id;
	private String nama;
	private String isbn;
	private Integer tahunTerbit;
	private String namaPengarang;
	private String penerbit;
	private Timestamp createdDate;
	private String createdBy;
	private Timestamp lastUpdatedDate;
	private String lastUpdatedBy;

	@Override
	public String toString() {
		return String.format(
				"{ID: %S, Nama: %s, ISBN: %s, Tahun terbit: %d, Nama pengarang: %s, Penrbit: %s, Created date: %s, Created by: %s, Last updated Date: %s, Last updated by: %s}",
				this.id, this.nama, this.isbn, this.tahunTerbit, this.namaPengarang, this.penerbit, this.createdDate,
				this.createdBy, this.lastUpdatedDate, this.lastUpdatedBy);
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getTahunTerbit() {
		return tahunTerbit;
	}

	public void setTahunTerbit(Integer tahunTerbit) {
		this.tahunTerbit = tahunTerbit;
	}

	public String getNamaPengarang() {
		return namaPengarang;
	}

	public void setNamaPengarang(String namaPengarang) {
		this.namaPengarang = namaPengarang;
	}

	public String getPenerbit() {
		return penerbit;
	}

	public void setPenerbit(String penerbit) {
		this.penerbit = penerbit;
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
