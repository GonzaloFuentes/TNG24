package com.uade.seminario.model;

import java.io.Serializable;

public class Ciudad implements Serializable{

	private static final long serialVersionUID = -8229409236061281236L;

	private int id;
	private String codigo;
	private String descripcion;
	private Provincia provincia;
	private char estado;
	
	public void mostrate(){
		//TODO implementar view.
	}
	
	public boolean cumplo(int id, String codigo, String descripcion, String codigoProvincia, char estado){
		//TODO implementar
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
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
		return "Ciudad [id=" + id + ", codigo=" + codigo + ", descripcion=" + descripcion + ", provincia=" + provincia
				+ ", estado=" + estado + "]";
	}
	
}

