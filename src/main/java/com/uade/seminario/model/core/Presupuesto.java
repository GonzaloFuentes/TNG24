package com.uade.seminario.model.core;

import java.util.Date;

public class Presupuesto extends Documento {
	private Empleado tecnico;
	
	
	
	public boolean cumplo(int id, Date fec, Cliente cli, int TMO, int MMO, Empleado tec) {
		return false;
	
	}
	
//	public ViewPresupuesto mostrate(Domicilio dom) {
//		return null;
//	
//	}
	
	public int cerrarme(int TMO, int MMO) {
		return MMO;
	
	}

	public Empleado getTecnico() {
		return tecnico;
	}

	public void setTecnico(Empleado tecnico) {
		this.tecnico = tecnico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tecnico == null) ? 0 : tecnico.hashCode());
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
		Presupuesto other = (Presupuesto) obj;
		if (tecnico == null) {
			if (other.tecnico != null)
				return false;
		} else if (!tecnico.equals(other.tecnico))
			return false;
		return true;
	}
	
//	public ViewPresupuesto mostrate() {
//		return null;
//	
//	}
	
	
	
	
}
