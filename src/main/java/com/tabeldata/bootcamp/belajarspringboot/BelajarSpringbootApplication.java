package com.tabeldata.bootcamp.belajarspringboot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.tabeldata.bootcamp.belajarspringboot.dao.BukuDao;
import com.tabeldata.bootcamp.belajarspringboot.model.Buku;

@SpringBootApplication
public class BelajarSpringbootApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BelajarSpringbootApplication.class, args);
		BukuDao dao = context.getBean(BukuDao.class);
		
		System.out.println("--- Search by ID ---");
		try {
			Buku progjava = dao.findById("prog-java");
			System.out.println(progjava.toString());
			System.out.println(dao.daftarList().size());
		} catch (EmptyResultDataAccessException erdae) {
			erdae.printStackTrace();
			System.err.println("Data tidak ditemukan");
		}
		
		System.out.println("--- Search by Nama Judul dan Pengarang ---");
		List<Buku> listByNameAndPengarang = dao.findByNameAndNamaPengarang("S", "H");
		System.out.println(listByNameAndPengarang.toString());
		System.out.println(dao.daftarList().size());
	}
}
