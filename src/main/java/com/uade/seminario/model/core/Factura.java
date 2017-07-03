package com.uade.seminario.model.core;

import java.util.Date;

public class Factura extends Documento {
	private char codTipoFactura;
	
	
	
	public boolean cumplo(int id, Date fec, Cliente cli, int TMO, int MMO, char tFact) {
		return false;
	
	}


//	public ViewFactura mostrate() {
//	return null;
//
//}

	public char getCodTipoFactura() {
		return codTipoFactura;
	}



	public void setCodTipoFactura(char codTipoFactura) {
		this.codTipoFactura = codTipoFactura;
	}
	

	
	
	
	
}
