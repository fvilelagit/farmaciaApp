package com.numberone.entidades;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Pedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Cliente cliente;	
	private List <Medicamento> listaMedicamentos;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant moment;
	private Double valorTotal;
	private Long numeroNf;

	
	public Pedido(Long id, Cliente cliente, List<Medicamento> listaMedicamentos, Double valorTotal) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.listaMedicamentos = listaMedicamentos;
		this.valorTotal = valorTotal;
	}


	public Pedido(Long id, Cliente cliente, List<Medicamento> listaMedicamentos, Instant moment, Double valorTotal,
			Long numeroNf) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.listaMedicamentos = listaMedicamentos;
		this.moment = moment;
		this.valorTotal = valorTotal;
		this.numeroNf = numeroNf;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Instant getMoment() {
		return moment;
	}


	public void setMoment(Instant moment) {
		this.moment = moment;
	}


	public Double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	
	
	
	
}
