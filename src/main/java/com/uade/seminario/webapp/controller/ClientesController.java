package com.uade.seminario.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uade.seminario.model.Cliente;
import com.uade.seminario.service.UserManager;

@Controller
@RequestMapping("/clientes*")
public class ClientesController {
		
		@Autowired
	    UserManager userManager;

	    @RequestMapping(method = RequestMethod.POST)
	    public String onSubmit(Cliente cliente, BindingResult result, HttpServletRequest request) throws Exception {
	    	return "clientesSuccess";
	    }
	    
	    @RequestMapping(method = RequestMethod.GET)
	    public String onClientes(Cliente cliente, BindingResult result, HttpServletRequest request) throws Exception {
	    	return "clientes";
	    }
	}

