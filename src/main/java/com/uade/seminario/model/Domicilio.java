package com.uade.seminario.model;

import java.io.Serializable;

public class Domicilio implements Serializable{

	private static final long serialVersionUID = -3715941845544089801L;
	
	private int id;
	private String calle;
	private String numero;
	private String piso;
	private String departamento;
	private Provincia provincia;
	private Ciudad ciudad;
	private CodigoPostal codigoPostal;
	private String descripcionLocalidad;
	private char estado;
	

}
