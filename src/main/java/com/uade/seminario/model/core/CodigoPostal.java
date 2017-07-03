package com.uade.seminario.model.core;

public class CodigoPostal {
	private int idCodigoPostal;
	private String codigoPostal;
	private String descCodigoPostal;
	private Provincia provincia;
	private Ciudad ciudad;
	private char estado;
	
	
	
//	public ViewCodigoPostal mostrate() {
//		return null;
//	
//	}
	
	public boolean cumplo(int id, String cod, String desc, String codProv, String codCiudad, char e) {
		return false;
	
	}



	public int getIdCodigoPostal() {
		return idCodigoPostal;
	}



	public void setIdCodigoPostal(int idCodigoPostal) {
		this.idCodigoPostal = idCodigoPostal;
	}



	public String getCodigoPostal() {
		return codigoPostal;
	}



	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}



	public String getDescCodigoPostal() {
		return descCodigoPostal;
	}



	public void setDescCodigoPostal(String descCodigoPostal) {
		this.descCodigoPostal = descCodigoPostal;
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
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + ((codigoPostal == null) ? 0 : codigoPostal.hashCode());
		result = prime * result + ((descCodigoPostal == null) ? 0 : descCodigoPostal.hashCode());
		result = prime * result + estado;
		result = prime * result + idCodigoPostal;
		result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
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
		CodigoPostal other = (CodigoPostal) obj;
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
		if (descCodigoPostal == null) {
			if (other.descCodigoPostal != null)
				return false;
		} else if (!descCodigoPostal.equals(other.descCodigoPostal))
			return false;
		if (estado != other.estado)
			return false;
		if (idCodigoPostal != other.idCodigoPostal)
			return false;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		return true;
	}
	
	
}
