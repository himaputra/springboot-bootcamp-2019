package com.tabeldata.bootcamp.belajarspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tabeldata.bootcamp.belajarspringboot.beans.Mahasiswa;

@Configuration
public class BeanConfig {
	@Bean
	public String nama1() {
		return "Configuration dari bean1";
	}
	
	@Bean
	public String nama2() {
		return "Configuration dari bean2";
	}
	
	@Bean
	public Mahasiswa hima() {
		return new Mahasiswa("Himawan Eka Putra", 7);
	}
	
	@Bean
	public Mahasiswa dimas() {
		return new Mahasiswa("Dimas Maryanto", 7);
	}
}
