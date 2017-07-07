package com.uade.seminario.model.core;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.uade.seminario.util.EstadoConstants;

@Entity  
@Table(name="ct_cliente")  
@PrimaryKeyJoinColumn(name="id_ente")  
public class Cliente extends Ente implements Serializable {
	private static final long serialVersionUID = -2011409847961846525L;

	@Column(name="telefono")  
	private String telefono;
	
	@Column(name="mail", nullable = false, length = 40)  
	private String mail;
	
	@Column(name="calle", nullable = false, length = 100)
	private String calle;
	
	@Column(name="numero", nullable = false, length = 40)
	private String numero;
	
	@Column(name="piso", nullable = false, length = 50)
	private String piso;
	
	@Column(name="departamento", nullable = false, length = 50)
	private String departamento;
	
	@Column(name="provincia", nullable = false, length = 40)
	private String provincia;
	
	@Column(name="ciudad", nullable = false, length = 40)
	private String ciudad;
	
	@Column(name="codigoPostal", nullable = false, length = 50)
	private String codigoPostal;
	
//	public ViewCliente mostrate() {
//	return null;
//
//}
	
	public boolean cumplo(int id, String nombre, String apellido, String documento, char e) {
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

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	
}
