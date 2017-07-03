package com.uade.seminario.model.core;

public class Devolucion extends Constancia {
	private Empleado encargadoStock;

	public Empleado getEncargadoStock() {
		return encargadoStock;
	}

	public void setEncargadoStock(Empleado encargadoStock) {
		this.encargadoStock = encargadoStock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((encargadoStock == null) ? 0 : encargadoStock.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Devolucion other = (Devolucion) obj;
		if (encargadoStock == null) {
			if (other.encargadoStock != null)
				return false;
		} else if (!encargadoStock.equals(other.encargadoStock))
			return false;
		return true;
	}
}


