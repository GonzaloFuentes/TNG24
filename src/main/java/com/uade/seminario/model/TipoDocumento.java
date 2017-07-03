package com.uade.seminario.model;

public class TipoDocumento {

	private String codigo;
	private String descripcion;
	private char estado;
	
	public TipoDocumento(String codigo, String descripcion, char estado){
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.estado=estado;
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
	
	public boolean cumplo(String codigo, String descripcion){
		//TODO
		return false;
	}
	
	public void mostrate(){
		//TODO implementar la view
	}

	@Override
	public String toString() {
		return "TipoDocumento [codigo=" + codigo + ", descripcion=" + descripcion + ", estado=" + estado + "]";
	}
}
