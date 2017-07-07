package com.uade.seminario.model.core;

import java.util.Date;

public class Visita {
	private int id;
	private Factura factura;
	private Presupuesto presupuesto;
	private Cliente cliente;
	private Date inicioProgramado;
	private Date finProgramado;
	private Date inicioReal;
	private Date finReal;
	private char estado;
	private String motivo;
	private Empleado tecnico;
	
	public boolean cumplo(int id, Factura fac, Presupuesto pres, Cliente cli, Date iniProg, Date finProg, Date iniReal, Date finReal, char e) {
		return false;
	
	}
	
//	public ViewVisita mostrate() {
//		return null;
//	}
	
	public Presupuesto nuevoPresupuesto() {
		return presupuesto;
	
	}
	
	public boolean esTuPresupuesto(int idPresupuesto) {
		return false;
	
	}
	
//	public ViewPresupuesto mostraPresupuesto() {
//		return null;
//	}
	
	public void crearVisita(Cliente cli, Date inicioProgramado, Date finProgramado, String motivo, Empleado tecnico) {
	
	}
	
	public void modificarVisita(String motivo) {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getInicioProgramado() {
		return inicioProgramado;
	}

	public void setInicioProgramado(Date inicioProgramado) {
		this.inicioProgramado = inicioProgramado;
	}

	public Date getFinProgramado() {
		return finProgramado;
	}

	public void setFinProgramado(Date finProgramado) {
		this.finProgramado = finProgramado;
	}

	public Date getInicioReal() {
		return inicioReal;
	}

	public void setInicioReal(Date inicioReal) {
		this.inicioReal = inicioReal;
	}

	public Date getFinReal() {
		return finReal;
	}

	public void setFinReal(Date finReal) {
		this.finReal = finReal;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Empleado getTecnico() {
		return tecnico;
	}

	public void setTecnico(Empleado tecnico) {
		this.tecnico = tecnico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + estado;
		result = prime * result + ((factura == null) ? 0 : factura.hashCode());
		result = prime * result + ((finProgramado == null) ? 0 : finProgramado.hashCode());
		result = prime * result + ((finReal == null) ? 0 : finReal.hashCode());
		result = prime * result + id;
		result = prime * result + ((inicioProgramado == null) ? 0 : inicioProgramado.hashCode());
		result = prime * result + ((inicioReal == null) ? 0 : inicioReal.hashCode());
		result = prime * result + ((motivo == null) ? 0 : motivo.hashCode());
		result = prime * result + ((presupuesto == null) ? 0 : presupuesto.hashCode());
		result = prime * result + ((tecnico == null) ? 0 : tecnico.hashCode());
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
		Visita other = (Visita) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (estado != other.estado)
			return false;
		if (factura == null) {
			if (other.factura != null)
				return false;
		} else if (!factura.equals(other.factura))
			return false;
		if (finProgramado == null) {
			if (other.finProgramado != null)
				return false;
		} else if (!finProgramado.equals(other.finProgramado))
			return false;
		if (finReal == null) {
			if (other.finReal != null)
				return false;
		} else if (!finReal.equals(other.finReal))
			return false;
		if (id != other.id)
			return false;
		if (inicioProgramado == null) {
			if (other.inicioProgramado != null)
				return false;
		} else if (!inicioProgramado.equals(other.inicioProgramado))
			return false;
		if (inicioReal == null) {
			if (other.inicioReal != null)
				return false;
		} else if (!inicioReal.equals(other.inicioReal))
			return false;
		if (motivo == null) {
			if (other.motivo != null)
				return false;
		} else if (!motivo.equals(other.motivo))
			return false;
		if (presupuesto == null) {
			if (other.presupuesto != null)
				return false;
		} else if (!presupuesto.equals(other.presupuesto))
			return false;
		if (tecnico == null) {
			if (other.tecnico != null)
				return false;
		} else if (!tecnico.equals(other.tecnico))
			return false;
		return true;
	}
	
	
}
