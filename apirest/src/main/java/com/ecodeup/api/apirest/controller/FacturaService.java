package com.ecodeup.api.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodeup.api.apirest.model.Cliente;
import com.ecodeup.api.apirest.model.Factura;

@Service
public class FacturaService {

	
	@Autowired
	private FacturaRepository facturaRepository;
	
	public void guardar (Factura factura) {
		facturaRepository.save(factura);
		
		
	}
	
	public List<Factura> obtenerFacturas(){
		return facturaRepository.findAll();
		
	}
	
	public Factura obtenerFactura(Integer id) {
		return facturaRepository.getOne(id);
	}
	
	public void actualizar (Factura factura) {
		facturaRepository.save(factura);

	}
}
