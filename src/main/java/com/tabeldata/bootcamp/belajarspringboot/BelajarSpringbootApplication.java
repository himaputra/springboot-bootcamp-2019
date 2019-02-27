package com.tabeldata.bootcamp.belajarspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.tabeldata.bootcamp.belajarspringboot.beans.Kelas;
import com.tabeldata.bootcamp.belajarspringboot.beans.Mahasiswa;

@SpringBootApplication
public class BelajarSpringbootApplication {
	
	
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BelajarSpringbootApplication.class, args);
		
		Kelas si = (Kelas) context.getBean("kelas");
		System.out.println(si.getNama());
		
		Mahasiswa hima = context.getBean("dimas", Mahasiswa.class);
		System.out.println(hima.toString());
//		
//		System.out.println("Nama: " + hima.getNama() + ", Semester: " + 
//		hima.getSemester() + ", Kelas: " + si.getNama());
		
//		System.out.println("--- Singleton ---");
//		RandomString rs = context.getBean("randomString", RandomString.class);
//		System.out.println(rs.getValue());
//		
//		rs = context.getBean("randomString", RandomString.class);
//		System.out.println(rs.getValue());
//		rs = context.getBean("randomString", RandomString.class);
//		System.out.println(rs.getValue());
//		
//		System.out.println("--- Prototype ---");
//		RandomStringPrototype proto = context.getBean(RandomStringPrototype.class);
//		System.out.println(proto.getValue());
//		
//		proto = context.getBean(RandomStringPrototype.class);
//		System.out.println(proto.getValue());
//		proto = context.getBean(RandomStringPrototype.class);
//		System.out.println(proto.getValue());
	}
}
