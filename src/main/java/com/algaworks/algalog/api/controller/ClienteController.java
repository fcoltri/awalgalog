package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setId(1L);
		cliente1.setNome("Antonio Alves Silva");
		cliente1.setEmail("antonio@gmail.com");
		cliente1.setTelefone("(11) 96543-1234");
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setId(2L);
		cliente2.setNome("Joao Lyra");
		cliente2.setEmail("joao@gmail.com");
		cliente2.setTelefone("(51) 99976-7865");
		
		
		
		
		
		return Arrays.asList(cliente1, cliente2);
	}

}
