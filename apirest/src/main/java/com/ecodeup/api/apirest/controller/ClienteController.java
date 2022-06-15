package com.ecodeup.api.apirest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecodeup.api.apirest.model.Cliente;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteServices;
	
	
	@GetMapping("api/cliente")
	public List<Cliente> obtenerClientes(){
		List<Cliente> listaClientes = new ArrayList<>();
		Cliente c = new Cliente();
		
		
		c.setId_cliente(1);
		c.setNombre("Daniela");
		c.setApellido("Fonseca");
		c.setDireccion("Calle 6 # 5-6");
		c.setFecha_nacimiento("06/02/1998");
		c.setTelefono("3123326093");
		c.setEmail("daniela@gmail.com");
		
		
		Cliente c1 = new Cliente();
		c1.setId_cliente(1);
		c1.setNombre("MAdleine");
		c1.setApellido("Bernal");
		c1.setDireccion("Calle 15 # 5-6");
		c1.setFecha_nacimiento("07/02/1898");
		c1.setTelefono("3123156093");
		c1.setEmail("dela@gmail.com");
		
		
		listaClientes.add(c);
		listaClientes.add(c1);
		
		
		return listaClientes;
	}
	
	@PostMapping("api/clientes")
	public Cliente guardarCliente (@RequestBody Cliente cliente ) {
		System.out.println(cliente);
		clienteServices.guardar(cliente);
		return cliente;
	}
	
	@GetMapping("api/clientes")
	public List<Cliente> obtener (){
		return clienteServices.obtenerTodos();
	}
	
	@GetMapping("api/clientes/{id_cliente}")
	public Cliente obtenerCliente(@PathVariable("id_cliente") Integer id_cliente) {
		return clienteServices.obtenerCliente(id_cliente);
	}
	
	@PutMapping("api/clientes")
	public void actualizarCliente (@RequestBody Cliente cliente) {
		clienteServices.actualizar(cliente);
	}
	
	@DeleteMapping("api/clientes/{id_cliente}")
	public void eliminar(@PathVariable("id_cliente") Integer id) {
		clienteServices.eliminar(id);
		
	}

}
