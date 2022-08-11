package com.numberone.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.numberone.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository <Cliente, Long>{

	List<Optional<Cliente>> findAllByNome(String nome);

	Optional<Cliente> findByCpf(String cpf);


}
