package com.uade.seminario.model.core;

public class Producto {
	private int id;
	private String codProducto;
	private String desc;
	private int stock;
	private int ptoPedido;
	private int precio;
	private char estado;

	
//	public ViewProducto mostrate() {
//		return null;
//	
//	}
	
	public Boolean cumplo(String cod, String desc) {
		return null;
	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCodProducto() {
		return codProducto;
	}


	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public int getPtoPedido() {
		return ptoPedido;
	}


	public void setPtoPedido(int ptoPedido) {
		this.ptoPedido = ptoPedido;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
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
		result = prime * result + ((codProducto == null) ? 0 : codProducto.hashCode());
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + estado;
		result = prime * result + id;
		result = prime * result + precio;
		result = prime * result + ptoPedido;
		result = prime * result + stock;
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
		Producto other = (Producto) obj;
		if (codProducto == null) {
			if (other.codProducto != null)
				return false;
		} else if (!codProducto.equals(other.codProducto))
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (estado != other.estado)
			return false;
		if (id != other.id)
			return false;
		if (precio != other.precio)
			return false;
		if (ptoPedido != other.ptoPedido)
			return false;
		if (stock != other.stock)
			return false;
		return true;
	}
	
	
}
