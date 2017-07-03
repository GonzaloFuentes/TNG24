package com.uade.seminario.model.core;

import java.util.ArrayList;

public class Encuesta {
	private int id;
	private Visita visita;
	private char estado;
	private ArrayList<PreguntaEncuesta> respuestas;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + estado;
		result = prime * result + id;
		result = prime * result + ((respuestas == null) ? 0 : respuestas.hashCode());
		result = prime * result + ((visita == null) ? 0 : visita.hashCode());
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
		Encuesta other = (Encuesta) obj;
		if (estado != other.estado)
			return false;
		if (id != other.id)
			return false;
		if (respuestas == null) {
			if (other.respuestas != null)
				return false;
		} else if (!respuestas.equals(other.respuestas))
			return false;
		if (visita == null) {
			if (other.visita != null)
				return false;
		} else if (!visita.equals(other.visita))
			return false;
		return true;
	}
	
	
}
