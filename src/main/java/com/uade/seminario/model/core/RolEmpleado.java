package com.uade.seminario.model.core;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="ct_rolempleado")
public class RolEmpleado {
	@Id
	private int id;
	private String codRollEmpleado;
	private String descRollEmpleado;
	private char estado;
	
	
	
	
	public Boolean cumplo(String cod, String desc) {
		return null;
	
	}




	public String getCodRollEmpleado() {
		return codRollEmpleado;
	}




	public void setCodRollEmpleado(String codRollEmpleado) {
		this.codRollEmpleado = codRollEmpleado;
	}




	public String getDescRollEmpleado() {
		return descRollEmpleado;
	}




	public void setDescRollEmpleado(String descRollEmpleado) {
		this.descRollEmpleado = descRollEmpleado;
	}




	public char getEstado() {
		return estado;
	}




	public void setEstado(char estado) {
		this.estado = estado;
	}

//	public ViewRollEmpleado mostrate() {
//	return null;
//
//}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codRollEmpleado == null) ? 0 : codRollEmpleado.hashCode());
		result = prime * result + ((descRollEmpleado == null) ? 0 : descRollEmpleado.hashCode());
		result = prime * result + estado;
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
		RolEmpleado other = (RolEmpleado) obj;
		if (codRollEmpleado == null) {
			if (other.codRollEmpleado != null)
				return false;
		} else if (!codRollEmpleado.equals(other.codRollEmpleado))
			return false;
		if (descRollEmpleado == null) {
			if (other.descRollEmpleado != null)
				return false;
		} else if (!descRollEmpleado.equals(other.descRollEmpleado))
			return false;
		if (estado != other.estado)
			return false;
		return true;
	}
	

	
	
}
