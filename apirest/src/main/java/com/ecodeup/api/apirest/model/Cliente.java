package com.ecodeup.api.apirest.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "CLIENTE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Cliente   {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id_cliente")
	private Integer id_cliente;
	
	@Column (name="nombre")
	private String nombre;
	
	@Column (name="apellido")
	private String apellido;
	
	@Column (name="direccion")
	private String direccion;
	
	@Column (name="fecha_nacimiento")
	private String fecha_nacimiento;
	
	@Column (name="telefono")
	private String telefono;
	
	@Column (name="email")
	private String email;
	
	@OneToMany(mappedBy = "cliente")
	private List<Factura> facturas;
	
	
	
	public Cliente() {
		
	}



	public Integer getId_cliente() {
		return id_cliente;
	}



	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}



	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}


	public List<Factura> getFacturas() {
		return facturas;
	}



	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}


	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", fecha_nacimiento=" + fecha_nacimiento + ", telefono=" + telefono + ", email=" + email
				+ ", facturas=" + facturas + "]";
	}



	
}
