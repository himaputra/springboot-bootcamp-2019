package com.tabeldata.bootcamp.belajarspringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BelajarSpringbootApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-container.xml");
		Mahasiswa hima = (Mahasiswa) context.getBean("mahasiswa");
		System.out.println(hima.toString());
		
		Mahasiswa dimas = (Mahasiswa) context.getBean("mahasiswa");
		System.out.println(dimas.toString());
		
		Kelas si = (Kelas) context.getBean("kelas");
		System.out.println(si.toString());
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
