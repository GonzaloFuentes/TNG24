package com.uade.seminario.dao.impl;

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.uade.seminario.dao.ClienteDao;
import com.uade.seminario.dao.hibernate.GenericDaoHibernate;
import com.uade.seminario.model.core.Cliente;

@Repository("clienteDao")
public class ClienteDaoImpl extends GenericDaoHibernate<Cliente, Long> implements ClienteDao {

	public ClienteDaoImpl() {
		super(Cliente.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> getClientes() {
		List<Cliente> clientes = null;
		try {
			clientes = getSession().createCriteria(Cliente.class).add(Restrictions.eq("estado", "A"))
					.addOrder(Order.asc("apellido")).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientes;
	}

	@Override
	public Cliente saveCliente(Cliente cliente) {
		try {
			getSession().saveOrUpdate(cliente);
			getSession().flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cliente;
	}

}
