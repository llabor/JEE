package com.company.model.business;
/*
 * Autor: Juan Daniel Sánchez
 * Fecha: 22/11/2017
 * Descripción: 
 */
public class Detalle {
	private int id_detalles;
	private int factura_fk;
	
	//Constructor
	public Detalle(){
		
	}
	
	//Getters y Setters
	public int getId_detalles() {
		return id_detalles;
	}

	public void setId_detalles(int id_detalles) {
		this.id_detalles = id_detalles;
	}

	public int getFactura_fk() {
		return factura_fk;
	}

	public void setFactura_fk(int factura_fk) {
		this.factura_fk = factura_fk;
	}
	
	
	
}
