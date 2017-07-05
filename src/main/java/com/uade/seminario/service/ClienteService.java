package com.uade.seminario.service;

import java.util.List;

import com.uade.seminario.model.core.Cliente;

public interface ClienteService {
	 List<Cliente> getClientes();
	 Cliente guardarCliente(Cliente cliente) ;//throws ClienteExisteException;
}
