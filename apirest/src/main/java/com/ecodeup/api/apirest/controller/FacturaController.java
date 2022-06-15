package com.ecodeup.api.apirest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecodeup.api.apirest.model.Cliente;
import com.ecodeup.api.apirest.model.Factura;

@RestController
public class FacturaController {
	
	@Autowired
	private FacturaService facturaServices;
	
	
	@GetMapping("api/factura")
	public List<Factura> obtenerFacturas(){
		List<Factura> listaFacturas = new ArrayList<>();
		Factura c = new Factura();
		Cliente cc = new Cliente();
		
		
		c.setNum_factura(1);
		c.setFecha("dddd");
		
		
		
		
		
		listaFacturas.add(c);
		
		
		return listaFacturas;
	}
	
	@PostMapping("api/facturas")
	public Factura guardarCliente (@RequestBody Factura factura ) {
		System.out.println(factura);
		facturaServices.guardar(factura);
		return factura;
	}
	
	@GetMapping("api/facturas")
	public List<Factura> obtener (){
		return facturaServices.obtenerFacturas();
	}
	
	@GetMapping("api/facturas/{num_factura}")
	public Factura obtenerFactura(@PathVariable("num_factura") Integer num_factura) {
		return facturaServices.obtenerFactura(num_factura);
	}
	
	@PutMapping("api/facturas")
	public void actualizarFactura (@RequestBody Factura factura) {
		facturaServices.actualizar(factura);
	}

}
