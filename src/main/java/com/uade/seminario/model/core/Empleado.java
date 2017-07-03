package com.uade.seminario.model.core;

public class Empleado extends Ente {
	private String telefono;
	private String mail;
	private RollEmpleado Rol;
	public boolean cumplo(int id, String apellido, String nombre, String roll, String documento, char e) {
		return false;
	
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public RollEmpleado getRol() {
		return Rol;
	}
	public void setRol(RollEmpleado rol) {
		Rol = rol;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Rol == null) ? 0 : Rol.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
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
		Empleado other = (Empleado) obj;
		if (Rol == null) {
			if (other.Rol != null)
				return false;
		} else if (!Rol.equals(other.Rol))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
	
//	public ViewEmpleado mostrate() {
//		return null;
//	
//	}
	
	
	
	
}
