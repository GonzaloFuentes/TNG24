package com.uade.seminario.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/facturas*")
public class FacturasController {

    @RequestMapping(method = RequestMethod.GET)
    public String execute(ModelMap model) {
    	return "facturas";
    }
}
