package com.uade.seminario.model.core;

public class Provincia {
	private int idProvincia;
	private String codProvincia;
	private String descProvincia;
	private char estado;
	
	
//	public ViewProvincia mostrate() {
//		return null;
//	
//	}
	
	public boolean cumplo(int id, String cod, String desc, char e) {
		return false;
	
	}


	public int getIdProvincia() {
		return idProvincia;
	}


	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}


	public String getCodProvincia() {
		return codProvincia;
	}


	public void setCodProvincia(String codProvincia) {
		this.codProvincia = codProvincia;
	}


	public String getDescProvincia() {
		return descProvincia;
	}


	public void setDescProvincia(String descProvincia) {
		this.descProvincia = descProvincia;
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
		result = prime * result + ((codProvincia == null) ? 0 : codProvincia.hashCode());
		result = prime * result + ((descProvincia == null) ? 0 : descProvincia.hashCode());
		result = prime * result + estado;
		result = prime * result + idProvincia;
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
		Provincia other = (Provincia) obj;
		if (codProvincia == null) {
			if (other.codProvincia != null)
				return false;
		} else if (!codProvincia.equals(other.codProvincia))
			return false;
		if (descProvincia == null) {
			if (other.descProvincia != null)
				return false;
		} else if (!descProvincia.equals(other.descProvincia))
			return false;
		if (estado != other.estado)
			return false;
		if (idProvincia != other.idProvincia)
			return false;
		return true;
	}
	
	
}
