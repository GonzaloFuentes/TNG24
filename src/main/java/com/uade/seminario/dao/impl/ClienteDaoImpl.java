package com.uade.seminario.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uade.seminario.dao.ClienteDao;
import com.uade.seminario.dao.hibernate.GenericDaoHibernate;
import com.uade.seminario.model.core.Cliente;

@Repository("clienteDao")
public class ClienteDaoImpl extends GenericDaoHibernate<Cliente, Long> implements ClienteDao {

	public ClienteDaoImpl() {
		super(Cliente.class);
	}

	@Override
	public List<Cliente> getClientes() {
		return null;
	}

	@Override
	public Cliente saveCliente(Cliente cliente) {

	try
	{
		if (log.isDebugEnabled()) {
			log.debug("cliente todo id: ");
		}
		
		getSession().saveOrUpdate(cliente);
		log.info("hizo el update: ");
		// necessary to throw a DataIntegrityViolation and catch it in
		// UserManager
		getSession().flush();
		log.info("hizo el flush: ");
	} catch(Exception e)
	{
		e.printStackTrace();
	}

	return cliente;
}

}
