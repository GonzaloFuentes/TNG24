package com.uade.seminario.model.core;

import java.util.ArrayList;

public class Agenda {
	private int idAgenda;
	private Empleado tecnico;
	private char estado;
	private ArrayList<Visita> visitas;
	
	
	public boolean cumplo(int id, Empleado tec, char e) {
		return false;
	
	}
	
//	public ViewAgenda mostrate() {
//	return null;
//	}
	
	public boolean esTuVisita(int idVisita) {
		return false;
	}
	
	public Visita buscarVisitaPresupuesto(int id) {
		return null;
	}
	
	public boolean bajaVisita(int id, String motivo) {
		return false;
	}
	
	public void cambiarEstado(char e) {
	
	}

	public int getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Empleado getTecnico() {
		return tecnico;
	}

	public void setTecnico(Empleado tecnico) {
		this.tecnico = tecnico;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public ArrayList<Visita> getVisitas() {
		return visitas;
	}

	public void setVisitas(ArrayList<Visita> visitas) {
		this.visitas = visitas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + estado;
		result = prime * result + idAgenda;
		result = prime * result + ((tecnico == null) ? 0 : tecnico.hashCode());
		result = prime * result + ((visitas == null) ? 0 : visitas.hashCode());
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
		Agenda other = (Agenda) obj;
		if (estado != other.estado)
			return false;
		if (idAgenda != other.idAgenda)
			return false;
		if (tecnico == null) {
			if (other.tecnico != null)
				return false;
		} else if (!tecnico.equals(other.tecnico))
			return false;
		if (visitas == null) {
			if (other.visitas != null)
				return false;
		} else if (!visitas.equals(other.visitas))
			return false;
		return true;
	}
	
	
}
