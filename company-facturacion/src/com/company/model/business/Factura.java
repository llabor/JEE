package com.company.model.business;

import java.util.Date;

/*
 * Autor: Juan Daniel Sánchez
 * Fecha: 22/11/2017
 * Descripción: 
 */
public class Factura {
	private int id_factura;
	private Date fecha;
	private double importe;
	private int cliente_fk;
	
	
	//Constructor
	public Factura(){
		
	}

	//Getter y Setters
	public int getId_factura() {
		return id_factura;
	}

	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public int getCliente_fk() {
		return cliente_fk;
	}

	public void setCliente_fk(int cliente_fk) {
		this.cliente_fk = cliente_fk;
	}
	
	
	
}
