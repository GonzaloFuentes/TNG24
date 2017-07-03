package com.uade.seminario.model.core;

public class TipoDocumento {
	private String codTipoDoc;
	private String descTipoDoc;
	private char estado;
	
	
	
	public Boolean cumplo(String cod, String desc) {
		return null;
	
	}



	public String getCodTipoDoc() {
		return codTipoDoc;
	}



	public void setCodTipoDoc(String codTipoDoc) {
		this.codTipoDoc = codTipoDoc;
	}



	public String getDescTipoDoc() {
		return descTipoDoc;
	}



	public void setDescTipoDoc(String descTipoDoc) {
		this.descTipoDoc = descTipoDoc;
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
		result = prime * result + ((codTipoDoc == null) ? 0 : codTipoDoc.hashCode());
		result = prime * result + ((descTipoDoc == null) ? 0 : descTipoDoc.hashCode());
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
		TipoDocumento other = (TipoDocumento) obj;
		if (codTipoDoc == null) {
			if (other.codTipoDoc != null)
				return false;
		} else if (!codTipoDoc.equals(other.codTipoDoc))
			return false;
		if (descTipoDoc == null) {
			if (other.descTipoDoc != null)
				return false;
		} else if (!descTipoDoc.equals(other.descTipoDoc))
			return false;
		if (estado != other.estado)
			return false;
		return true;
	}
	
//	public ViewTipoDocumento mostrate() {
//		return null;
//	
//	}
	
	
}
