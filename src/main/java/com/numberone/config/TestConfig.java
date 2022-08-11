package com.numberone.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.numberone.entidades.Cliente;
import com.numberone.repositorios.ClienteRepositorio;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private ClienteRepositorio clienteRepositorio;

	@Override
	public void run(String... args) throws Exception {
		Cliente c1 = new Cliente(null,"Fabio",123456789,new Date());
		Cliente c2 = new Cliente(null, "Rafa", 88888888, new Date());
		
		clienteRepositorio.saveAll(Arrays.asList(c1,c2));
		
		
		
	}	

	
}
