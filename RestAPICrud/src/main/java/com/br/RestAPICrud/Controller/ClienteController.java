package com.br.RestAPICrud.Controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.RestAPICrud.Model.Cliente;
import com.br.RestAPICrud.Repository.ClienteRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ClienteController {
	
	ClienteRepository repository;
	
	@GetMapping("/clientes")
	public List<Cliente> getAllClientes(){
		return repository.findAll();
	}

	@GetMapping("/cliente/{id}")
	public Cliente getClienteById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/cliente")
	public Cliente saveCliente(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
	
	@DeleteMapping("/cliente/{id}")
	public void deleteCliente(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
