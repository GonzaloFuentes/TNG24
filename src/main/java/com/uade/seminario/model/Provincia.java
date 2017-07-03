package com.uade.seminario.model;

import java.io.Serializable;

public class Provincia implements Serializable {

	private static final long serialVersionUID = 3269138658700476594L;
	
	private int id;
	private String codigo;
	private String descripcion;
	private char estado;
	
	public void mostrate(){
		//TODO hacer la view
	}
	
	private boolean cumplo(int id, String codigo, String descripcion,char estado){
		//TODO implementar
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int idProvincia) {
		this.id = idProvincia;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Provincia [idProvincia=" + id + ", codigo=" + codigo + ", descripcion=" + descripcion
				+ ", estado=" + estado + "]";
	}
	
}
