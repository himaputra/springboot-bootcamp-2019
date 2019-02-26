package com.tabeldata.bootcamp.belajarspringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BelajarSpringbootApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-container.xml");
		Mahasiswa hima = (Mahasiswa) context.getBean("mahasiswa");
		
		System.out.println("Nama: " + hima.getNama() + ", Semester: " + 
		hima.getSemester() + ", Kelas: " + hima.getKelas().getNama());
	}
}
