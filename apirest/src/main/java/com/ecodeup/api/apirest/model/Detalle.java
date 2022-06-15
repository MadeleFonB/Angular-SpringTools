package com.ecodeup.api.apirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "DETALLE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Detalle {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "num_detalle")
	private Integer num_detalle;
	
	@Column(name= "cantidad")
	private Integer cantidad;
	
	@Column(name= "precio")
	private double precio;
}
