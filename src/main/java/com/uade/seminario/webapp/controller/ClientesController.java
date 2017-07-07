package com.uade.seminario.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uade.seminario.model.core.Cliente;
import com.uade.seminario.service.ClienteService;

@Controller
public class ClientesController {
		@Autowired
		ClienteService clienteService;
		

	    @RequestMapping(value ="/nuevoCliente", method = RequestMethod.POST)
	    public ModelAndView nuevoCliente(Cliente cliente, BindingResult result, HttpServletRequest request) throws Exception {
	    	cliente.setEstado("A");
	    	clienteService.guardarCliente(cliente);
	    	ModelAndView mv = new ModelAndView("clientes");
	    	mv.addObject("listaClientes", clienteService.getClientes());
	    	mv.addObject("clienteNuevo", "OK");
	    	return mv;
	    }
	    
	    @RequestMapping(value ="/editarCliente", method = RequestMethod.POST)
	    public String editarCliente(Cliente cliente, BindingResult result, HttpServletRequest request, ModelAndView mv) throws Exception {
	    	clienteService.guardarCliente(cliente);
	    	mv.addObject("clienteNuevo", "OK");
	    	return "redirect:clientes";
	    }
	    
	    @RequestMapping(value ="/eliminarCliente", method = RequestMethod.POST)
	    public String eliminarCliente(HttpServletRequest request) throws Exception {
	    	//TODO eliminar cliente
	    	return "redirect:clientes";
	    }
	    
	    @RequestMapping(value ="/clientes", method = RequestMethod.GET)
	    public ModelAndView obtenerClientes() throws Exception {
	    	ModelAndView mv = new ModelAndView("clientes");
	    	mv.addObject("listaClientes", clienteService.getClientes());
	    	return mv;
	    }
	}

