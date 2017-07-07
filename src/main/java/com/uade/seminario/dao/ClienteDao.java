package com.uade.seminario.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.uade.seminario.model.core.Cliente;

public interface ClienteDao {
   
    @Transactional
	List<Cliente> getClientes();
    
    @Transactional
    Cliente saveCliente(Cliente cliente);
}
