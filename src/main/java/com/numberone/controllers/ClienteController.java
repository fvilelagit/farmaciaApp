package com.numberone.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.numberone.entidades.Cliente;
import com.numberone.servicosIMPL.ClienteServicoIMPL;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

	@Autowired
	private ClienteServicoIMPL servico;

	@GetMapping
	public ResponseEntity <List<Cliente>> findAll(){
		List<Cliente> lista = servico.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
}
