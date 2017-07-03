package com.uade.seminario.model.core;

import java.util.Date;

public class Constancia {
	private int id;
	private int nrolote;
	private Date fechaEmision;
	private Producto producto;
	private int cant;
	private Empleado tecnico;
	private char estadoAprobacion;
	private char estado;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNrolote() {
		return nrolote;
	}
	public void setNrolote(int nrolote) {
		this.nrolote = nrolote;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	public Empleado getTecnico() {
		return tecnico;
	}
	public void setTecnico(Empleado tecnico) {
		this.tecnico = tecnico;
	}
	public char getEstadoAprobacion() {
		return estadoAprobacion;
	}
	public void setEstadoAprobacion(char estadoAprobacion) {
		this.estadoAprobacion = estadoAprobacion;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cant;
		result = prime * result + estado;
		result = prime * result + estadoAprobacion;
		result = prime * result + ((fechaEmision == null) ? 0 : fechaEmision.hashCode());
		result = prime * result + id;
		result = prime * result + nrolote;
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		result = prime * result + ((tecnico == null) ? 0 : tecnico.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Constancia other = (Constancia) obj;
		if (cant != other.cant)
			return false;
		if (estado != other.estado)
			return false;
		if (estadoAprobacion != other.estadoAprobacion)
			return false;
		if (fechaEmision == null) {
			if (other.fechaEmision != null)
				return false;
		} else if (!fechaEmision.equals(other.fechaEmision))
			return false;
		if (id != other.id)
			return false;
		if (nrolote != other.nrolote)
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		if (tecnico == null) {
			if (other.tecnico != null)
				return false;
		} else if (!tecnico.equals(other.tecnico))
			return false;
		return true;
	}
}
