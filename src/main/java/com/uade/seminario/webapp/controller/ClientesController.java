package com.uade.seminario.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uade.seminario.model.core.Cliente;
import com.uade.seminario.model.core.TipoDocumento;
import com.uade.seminario.service.ClienteService;

@Controller
@RequestMapping("/clientes*")
public class ClientesController {
		@Autowired
		ClienteService clienteService;
		

	    @RequestMapping(method = RequestMethod.POST)
	    public String onSubmit(Cliente cliente, BindingResult result, HttpServletRequest request) throws Exception {
	    	return "clientesSuccess";
	    }
	    
	    @RequestMapping(method = RequestMethod.GET)
	    public String onClientes(Cliente cliente, BindingResult result, HttpServletRequest request) throws Exception {
	    	Cliente clienteMock = new Cliente();
	    	clienteMock.setNombre("test nombre");
	    	clienteMock.setApellido("test_apellido");
	    	
	    	TipoDocumento td = new TipoDocumento();
	    	td.setCodTipoDoc("DNI");
	    	td.setDescTipoDoc("DNI");
	    	td.setEstado('A');
	    	
	    	clienteMock.setTipoDoc(td);
	    	
	    	
	    	clienteService.guardarCliente(clienteMock);
	    	
	    	return "clientes";
	    }
	}

