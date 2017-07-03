package com.uade.seminario.model;

import java.io.Serializable;

public class Usuario implements Serializable{
	private static final long serialVersionUID = -7653420808882141573L;
	
	private String username;
	private String password;
	private char estado;
	
	public Usuario(String usernaname, String password, char estado){
		this.username=usernaname;
		this.password=password;
		this.estado=estado;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Usuario [username=" + username + ", password=" + password + ", estado=" + estado + "]";
	}
}
