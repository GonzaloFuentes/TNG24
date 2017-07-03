package com.uade.seminario.model.core;

public class Domicilio {
	private Object idDomicilio;
	private String calle;
	private String numero;
	private String piso;
	private String dpto;
	private String telefono;
	private Provincia provincia;
	private Ciudad ciudad;
	private CodigoPostal codigoPostal;
	private String descLocalidad;
	private char estado;
	
	
//	public ViewDomicilio mostrate() {
//		return null;
//	
//	}
	
	public boolean cumplo(int id, String calle , String nro, String piso, String dpto, String tel, String prov, String cdad, String cp, String desc) {
		return false;
	
	}


	public Object getIdDomicilio() {
		return idDomicilio;
	}


	public void setIdDomicilio(Object idDomicilio) {
		this.idDomicilio = idDomicilio;
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


	public String getDpto() {
		return dpto;
	}


	public void setDpto(String dpto) {
		this.dpto = dpto;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public Provincia getProvincia() {
		return provincia;
	}


	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}


	public Ciudad getCiudad() {
		return ciudad;
	}


	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}


	public CodigoPostal getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(CodigoPostal codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getDescLocalidad() {
		return descLocalidad;
	}


	public void setDescLocalidad(String descLocalidad) {
		this.descLocalidad = descLocalidad;
	}


	public char getEstado() {
		return estado;
	}


	public void setEstado(char estado) {
		this.estado = estado;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calle == null) ? 0 : calle.hashCode());
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + ((codigoPostal == null) ? 0 : codigoPostal.hashCode());
		result = prime * result + ((descLocalidad == null) ? 0 : descLocalidad.hashCode());
		result = prime * result + ((dpto == null) ? 0 : dpto.hashCode());
		result = prime * result + estado;
		result = prime * result + ((idDomicilio == null) ? 0 : idDomicilio.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((piso == null) ? 0 : piso.hashCode());
		result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
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
		Domicilio other = (Domicilio) obj;
		if (calle == null) {
			if (other.calle != null)
				return false;
		} else if (!calle.equals(other.calle))
			return false;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (codigoPostal == null) {
			if (other.codigoPostal != null)
				return false;
		} else if (!codigoPostal.equals(other.codigoPostal))
			return false;
		if (descLocalidad == null) {
			if (other.descLocalidad != null)
				return false;
		} else if (!descLocalidad.equals(other.descLocalidad))
			return false;
		if (dpto == null) {
			if (other.dpto != null)
				return false;
		} else if (!dpto.equals(other.dpto))
			return false;
		if (estado != other.estado)
			return false;
		if (idDomicilio == null) {
			if (other.idDomicilio != null)
				return false;
		} else if (!idDomicilio.equals(other.idDomicilio))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (piso == null) {
			if (other.piso != null)
				return false;
		} else if (!piso.equals(other.piso))
			return false;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
	
}
