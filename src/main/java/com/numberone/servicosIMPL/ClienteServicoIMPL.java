package com.numberone.servicosIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numberone.entidades.Cliente;
import com.numberone.repositorios.ClienteRepositorio;
import com.numberone.servicos.ClienteServico;

@Service
public abstract class ClienteServicoIMPL implements ClienteServico{

	@Autowired
	private ClienteRepositorio repositorio;

	@Override
	public List<Cliente> findAll(){
		return repositorio.findAll();

	}

	@Override
	public Cliente save(Cliente c) {
		return repositorio.save(c);
	}

	@Override
	public Cliente findById(Long id) {
		Optional <Cliente> c = repositorio.findById(id);
		return c.get();
	}

	@Override
	public Cliente findByCpf(String cpf) {
		Optional <Cliente> c = repositorio.findByCpf(cpf);
		return c.get();
	}

}
