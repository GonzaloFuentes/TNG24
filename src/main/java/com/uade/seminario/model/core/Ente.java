package com.uade.seminario.model.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "ct_ente")
@Inheritance(strategy=InheritanceType.JOINED) 
public abstract class Ente implements Serializable{

	private static final long serialVersionUID = -555643417995357079L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_ente") 
	private int idEnte;

    @Column(nullable = false, length = 50)
	private String nombre;

    @Column(nullable = false, length = 50)
	private String apellido;
    	
    @Column(nullable = false, length = 50)
	private String tipoDoc;

    @Column(nullable = false, length = 50)
	private String nroDoc;

    @Column(nullable = false,length = 50)
	private String estado;

	public int getIdEnte() {
		return idEnte;
	}

	public void setIdEnte(int idEnte) {
		this.idEnte = idEnte;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNroDoc() {
		return nroDoc;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + idEnte;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nroDoc == null) ? 0 : nroDoc.hashCode());
		result = prime * result + ((tipoDoc == null) ? 0 : tipoDoc.hashCode());
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
		Ente other = (Ente) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (estado != other.estado)
			return false;
		if (idEnte != other.idEnte)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nroDoc == null) {
			if (other.nroDoc != null)
				return false;
		} else if (!nroDoc.equals(other.nroDoc))
			return false;
		if (tipoDoc == null) {
			if (other.tipoDoc != null)
				return false;
		} else if (!tipoDoc.equals(other.tipoDoc))
			return false;
		return true;
	}

}
