package com.uade.seminario.model;

import java.io.Serializable;

public abstract class Ente implements Serializable {
	
	private static final long serialVersionUID = -1537643130946770530L;
	
	private int id;
	private String nombre;
	private String apellido;
	private TipoDocumento tipoDocumento;
	private String nroDocumento;
	private char estado;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public String getNroDocumento() {
		return nroDocumento;
	}
	
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	
	public char getEstado() {
		return estado;
	}
	
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Ente [idEnte=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", tipoDocumento="
				+ tipoDocumento + ", nroDocumento=" + nroDocumento + ", estado=" + estado + "]";
	}
	
}
