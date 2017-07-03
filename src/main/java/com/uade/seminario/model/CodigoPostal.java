package com.uade.seminario.model;

import java.io.Serializable;

public class CodigoPostal implements Serializable{

	private static final long serialVersionUID = -3430636543913855936L;
	
	private int id;
	private String codigoPostal;
	private String descripcion;
	private Provincia provincia;
	private Ciudad ciudad;
	private char estado;
	
	public void mostrate(){
		//TODO implementar view.
	}
	
	public boolean cumplo(int id, String codigo, String descripcion, String codigoProvincia, String codigoCiudad, char estado){
		//TODO implementar
		return false;
	}
	
	

}
