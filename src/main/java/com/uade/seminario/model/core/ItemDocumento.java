package com.uade.seminario.model.core;

public class ItemDocumento {
	private int nroItem;
	private Producto producto;
	private int cantProd;
	private int montoItem;
	private int idItemPresupuesto;
	
	
	public boolean cumplo(int id, Producto prod, int cant, int monto, int nroItem) {
		return false;
	}


	public int getNroItem() {
		return nroItem;
	}



	public void setNroItem(int nroItem) {
		this.nroItem = nroItem;
	}



	public Producto getProducto() {
		return producto;
	}



	public void setProducto(Producto producto) {
		this.producto = producto;
	}



	public int getCantProd() {
		return cantProd;
	}



	public void setCantProd(int cantProd) {
		this.cantProd = cantProd;
	}



	public int getMontoItem() {
		return montoItem;
	}



	public void setMontoItem(int montoItem) {
		this.montoItem = montoItem;
	}



	public int getIdItemPresupuesto() {
		return idItemPresupuesto;
	}



	public void setIdItemPresupuesto(int idItemPresupuesto) {
		this.idItemPresupuesto = idItemPresupuesto;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantProd;
		result = prime * result + idItemPresupuesto;
		result = prime * result + montoItem;
		result = prime * result + nroItem;
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
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
		ItemDocumento other = (ItemDocumento) obj;
		if (cantProd != other.cantProd)
			return false;
		if (idItemPresupuesto != other.idItemPresupuesto)
			return false;
		if (montoItem != other.montoItem)
			return false;
		if (nroItem != other.nroItem)
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		return true;
	}
	
//	public ViewItemDocumento mostrate() {
//		return null;
//	
//	}
	
	
}
