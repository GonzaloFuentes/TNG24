package com.uade.seminario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uade.seminario.dao.ClienteDao;
import com.uade.seminario.model.core.Cliente;
import com.uade.seminario.service.ClienteService;

@Service("clienteManager")
public class ClienteServiceImpl implements ClienteService {
	//Hacer dao
	
	@Autowired
	ClienteDao clienteDao;
	
	@Override
	public List<Cliente> getClientes() {
		return clienteDao.getClientes();
	}

	@Override
	public Cliente guardarCliente(Cliente cliente)  {
		clienteDao.saveCliente(cliente);
		return cliente;
	}

	
}
