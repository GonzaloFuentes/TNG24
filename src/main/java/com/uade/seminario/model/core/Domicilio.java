package com.uade.seminario.model.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity  
@Table(name="tg_domicilio") 
public class Domicilio {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_domicilio")
	private int idDomicilio;
	
	@Column(nullable = false, length = 50)
	private String calle;
	
	@Column(nullable = false)
	private int numero;
	
	@Column
	private int piso;
	
	@Column(nullable = true, length = 2)
	private String dpto;
	
	@Column(nullable = true, length = 50)
	private String telefono;
	
	@Transient
	private Provincia provincia;
	
	@Transient
	private Ciudad ciudad;

	@Transient
	private CodigoPostal codigoPostal;
	
	@Transient
	private String descLocalidad;
	@Transient
	private char estado;
	
	/*
	 * 
CREATE TABLE TG_DOMICILIO
(
IDDOMICILIO INT NOT NULL AUTO_INCREMENT,
CALLE NVARCHAR(50) NOT NULL,
NUMERO INT NOT NULL,
PISO INT,
DPTO CHAR(2),
TELEFONO NVARCHAR(50),
CODPROVINCIA CHAR(2) NOT NULL,
CODCIUDAD CHAR(5) NOT NULL,
CODIGOPOSTAL NVARCHAR(10) NOT NULL,
DESCLOCALIDAD NVARCHAR(40),
ESTADO CHAR(1) NOT NULL,
CONSTRAINT CHK_ESTADO_DOMICILIO CHECK (ESTADO = 'A' OR ESTADO = 'M' OR ESTADO = 'B'),
CONSTRAINT  PK_DOMICILIO PRIMARY KEY (IDDOMICILIO)
#OK FOREING VER ABAJO
);*/
	
	
//	public ViewDomicilio mostrate() {
//		return null;
//	
//	}
	
	public boolean cumplo(int id, String calle , String nro, String piso, String dpto, String tel, String prov, String cdad, String cp, String desc) {
		return false;
	
	}







	
}
