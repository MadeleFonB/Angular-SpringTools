package com.ecodeup.api.apirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "PRODUCTO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Producto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_producto")
	private Integer id_producto;
	
	@Column(name= "nombre")
	private Integer nombre;
	
	@Column(name= "precio")
	private double precio;
	
	@Column(name= "stock")
	private Integer stock;
}
