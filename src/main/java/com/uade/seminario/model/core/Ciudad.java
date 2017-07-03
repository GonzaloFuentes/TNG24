package com.uade.seminario.model.core;

public class Ciudad {
	private int idCiudad;
	private String codCiudad;
	private String descCiudad;
	private Provincia provincia;
	private char estado;
	
//	public ViewCiudad mostrate() {
//		return null;
//	
//	}
	
	public boolean cumplo(int id, String cod, String desc, String codProv, char e) {
	return true;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getCodCiudad() {
		return codCiudad;
	}

	public void setCodCiudad(String codCiudad) {
		this.codCiudad = codCiudad;
	}

	public String getDescCiudad() {
		return descCiudad;
	}

	public void setDescCiudad(String descCiudad) {
		this.descCiudad = descCiudad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
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
		result = prime * result + ((codCiudad == null) ? 0 : codCiudad.hashCode());
		result = prime * result + ((descCiudad == null) ? 0 : descCiudad.hashCode());
		result = prime * result + estado;
		result = prime * result + idCiudad;
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
		Ciudad other = (Ciudad) obj;
		if (codCiudad == null) {
			if (other.codCiudad != null)
				return false;
		} else if (!codCiudad.equals(other.codCiudad))
			return false;
		if (descCiudad == null) {
			if (other.descCiudad != null)
				return false;
		} else if (!descCiudad.equals(other.descCiudad))
			return false;
		if (estado != other.estado)
			return false;
		if (idCiudad != other.idCiudad)
			return false;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		return true;
	}
	
}
