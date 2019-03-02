package com.tabeldata.bootcamp.belajarspringboot;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.tabeldata.bootcamp.belajarspringboot.dao.AnggotaDao;
import com.tabeldata.bootcamp.belajarspringboot.dao.BukuDao;
import com.tabeldata.bootcamp.belajarspringboot.model.Anggota;
import com.tabeldata.bootcamp.belajarspringboot.model.Buku;

@SpringBootApplication
public class BelajarSpringbootApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BelajarSpringbootApplication.class, args);
		AnggotaDao dao = context.getBean(AnggotaDao.class);
		
//		Tambah Anggota
		Anggota tambah = new Anggota();
		tambah.setId("3571031904960001");
		tambah.setNama("Himawan Eka Putra");
		tambah.setTtl(Date.valueOf(LocalDate.of(1996, 04, 19)));
		tambah.setJenisKelamin("Laki-laki");
		tambah.setAlamat("Griya Asri Cahaya Cipageran");
		tambah.setAgama("Islam");
		tambah.setBerlaku(Date.valueOf(LocalDate.of(2020, 04, 19)));
		tambah.setCreatedBy("Admin");
		dao.save(tambah);
		
		System.out.println();
		
//		Cari Anggota
		Anggota cari = dao.findByName("Hima");
//		System.out.println(cari.toString());
		
//		Edit Anggota
		cari.setNama("Himawan Putra");
		cari.setLastUpdatedDate(Timestamp.valueOf(LocalDateTime.now()));
//		dao.update(cari);
		
//		Hapus Anggota
//		dao.delete("3571031904960001");
		
		System.out.println();
		System.out.println("--- Daftar Anggota ---");
		List<Anggota> listAnggota = dao.daftarAnggota();
		for(Anggota anggota: listAnggota) {
			System.out.println(anggota.toString());
		}
			
		
//		BukuDao dao = context.getBean(BukuDao.class);
//		System.out.println("--- Search by ID ---");
//		try {
//			Buku progjava = dao.findById("prog-java");
//			progjava.setTahunTerbit(2018);
//			progjava.setLastUpdatedDate(Timestamp.valueOf(LocalDateTime.now()));
//			progjava.setLastUpdatedBy("hima");
//			dao.update(progjava);
//			System.out.println(progjava.toString());
//			System.out.println(dao.daftarList().size());
//		} catch (EmptyResultDataAccessException erdae) {
//			erdae.printStackTrace();
//			System.err.println("Data tidak ditemukan");
//		}
//		
//		System.out.println("--- Search by Nama Judul dan Pengarang ---");
//		List<Buku> listByNameAndPengarang = dao.findByNameAndNamaPengarang("S", "H");
//		System.out.println(listByNameAndPengarang.toString());
//		System.out.println(dao.daftarList().size());
//		
//		System.out.println("--- Fitur Insert ---");
//		Buku pemrograman = new Buku();
//		pemrograman.setId(UUID.randomUUID().toString());
//		pemrograman.setNama("Bahasa Pemrograman Java II");
//		pemrograman.setIsbn("4231");
//		pemrograman.setNamaPengarang("Nanra Sukedy");
//		pemrograman.setPenerbit("Airlangga");
//		pemrograman.setTahunTerbit(2019);
//		pemrograman.setCreatedBy("operator");
//		
////		dao.save(pemrograman);
//		dao.delete("24efbd11-7dd2-43e8-93f0-afd2721dd22");
//		
//		System.out.println("--- Update list data ---");
//		List<Buku> list = dao.daftarList();
//		for(Buku buku : list) {
//			System.out.println(buku.toString());
//		}
		
	}
}
