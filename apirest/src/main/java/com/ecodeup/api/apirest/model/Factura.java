package com.ecodeup.api.apirest.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "FACTURA")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Factura   {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "num_factura")
	private Integer num_factura;
	
	@Column(name= "fecha")
	private String fecha;
	
	@ManyToOne
	private Cliente cliente;
	
	
	
	
	

	public Factura() {
		
	}


	public Integer getNum_factura() {
		return num_factura;
	}


	public void setNum_factura(Integer num_factura) {
		this.num_factura = num_factura;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "Factura [num_factura=" + num_factura + ", fecha=" + fecha + ", cliente=" + cliente + "]";
	}


	


	


	
	
	
	
	
	
	
}

