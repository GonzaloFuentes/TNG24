package com.uade.seminario.model.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="ct_empleado")  
@PrimaryKeyJoinColumn(name="id_ente")  
public class Empleado extends Ente implements Serializable{

	private static final long serialVersionUID = 1050321399673083419L;
	
	@Column(name="telefono") 
	private String telefono;
	
	@Column(name="mail") 
	private String mail;
	
	@OneToOne
	@JoinColumn(name="id_rollempleado")
	private RolEmpleado Rol;
	
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
	public RolEmpleado getRol() {
		return Rol;
	}
	public void setRol(RolEmpleado rol) {
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
