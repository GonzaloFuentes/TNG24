package com.uade.seminario.model.core;

import java.util.ArrayList;
import java.util.Date;

public class Documento {
	private int id;
	private Date fechaEmision;
	private Cliente cliente;
	private int tiempoManoObra;
	private int montoManoObra;
	private ArrayList<ItemDocumento> items;
	
//	public ArrayList<ViewItemDocumento> listaritemsDocumento() {
//		return null;
//	
//	}
	
	public int nuevoItem(Producto cod, int cant) {
		return 0;
	
	}
	
	public boolean bajaItem(int nro) {
		return false;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getTiempoManoObra() {
		return tiempoManoObra;
	}

	public void setTiempoManoObra(int tiempoManoObra) {
		this.tiempoManoObra = tiempoManoObra;
	}

	public int getMontoManoObra() {
		return montoManoObra;
	}

	public void setMontoManoObra(int montoManoObra) {
		this.montoManoObra = montoManoObra;
	}

	public ArrayList<ItemDocumento> getItems() {
		return items;
	}

	public void setItems(ArrayList<ItemDocumento> items) {
		this.items = items;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((fechaEmision == null) ? 0 : fechaEmision.hashCode());
		result = prime * result + id;
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		result = prime * result + montoManoObra;
		result = prime * result + tiempoManoObra;
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
		Documento other = (Documento) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (fechaEmision == null) {
			if (other.fechaEmision != null)
				return false;
		} else if (!fechaEmision.equals(other.fechaEmision))
			return false;
		if (id != other.id)
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		if (montoManoObra != other.montoManoObra)
			return false;
		if (tiempoManoObra != other.tiempoManoObra)
			return false;
		return true;
	}
	
}
