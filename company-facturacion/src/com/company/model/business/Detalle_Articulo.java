package com.company.model.business;
/*
 * Autor: Juan Daniel Sánchez
 * Fecha: 22/11/2017
 * Descripción: 
 */
public class Detalle_Articulo {
	private int articulo_id_articulo;
	private int detalle_id_detalle;
	private int cantidad;
	
	//Constructor
	public Detalle_Articulo(){
	
	}
	
	//Getters y Setters
	public int getArticulo_id_articulo() {
		return articulo_id_articulo;
	}

	public void setArticulo_id_articulo(int articulo_id_articulo) {
		this.articulo_id_articulo = articulo_id_articulo;
	}

	public int getDetalle_id_detalle() {
		return detalle_id_detalle;
	}

	public void setDetalle_id_detalle(int detalle_id_detalle) {
		this.detalle_id_detalle = detalle_id_detalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
}
