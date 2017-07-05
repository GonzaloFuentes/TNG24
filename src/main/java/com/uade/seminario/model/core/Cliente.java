package com.uade.seminario.model.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.uade.seminario.util.EstadoConstants;

@Entity  
@Table(name="ct_cliente")  
@PrimaryKeyJoinColumn(name="id_ente")  
public class Cliente extends Ente {
	
	@Column(name="telefono")  
	private String telefono;
	
	@Column(name="mail")  
	private String mail;
	
//	@OneToOne(cascade = CascadeType.ALL)
//  @JoinColumn(name = "id_domicilio")
//	private Domicilio domicilio;
	
	public boolean cumplo(int id, String nombre, String apellido, String documento, char e) {
		return false;
	}
	
//	public ViewCliente mostrate() {
//		return null;
//	
//	}
	
	public void editate(String apellido, String nombre, String documento, String codDoc, String tel, String mail, int dom) {
	}
	
	public void bajate() {
		this.setEstado(EstadoConstants.BAJA);
	}
	
	public void rehabilitate() {
		this.setEstado(EstadoConstants.ALTA);
	}
	
	public boolean sosCliente(int id) {
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

	
//	public Domicilio getDomicilio() {
//		return domicilio;
//	}
//
//	public void setDomicilio(Domicilio domicilio) {
//		this.domicilio = domicilio;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + ((domicilio == null) ? 0 : domicilio.hashCode());
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
		Cliente other = (Cliente) obj;
//		if (domicilio == null) {
//			if (other.domicilio != null)
//				return false;
//		} else if (!domicilio.equals(other.domicilio))
//			return false;
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
	
	
}
