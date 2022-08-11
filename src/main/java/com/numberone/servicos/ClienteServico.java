package com.numberone.servicos;

import java.util.List;

import com.numberone.entidades.Cliente;

public interface ClienteServico {

	Cliente save(Cliente c);
	
	List<Cliente>findAll();
	
	Cliente findById(Long id);
	
	Cliente findByCpf(String nome);

}
