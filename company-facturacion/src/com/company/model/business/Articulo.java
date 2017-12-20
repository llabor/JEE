package com.company.model.business;
/*
 * Autor: Juan Daniel Sánchez
 * Fecha: 22/11/2017
 * Descripción: 
 */
public class Articulo {
	//Atributos
	private int id_articulo;
	private String descripcion;
	private double pvp;
	
	//Constructor
	public Articulo(){
		
	}
	
	
	//Getters y Setters
	public int getId_articulo() {
		return id_articulo;
	}
	public void setId_articulo(int id_articulo) {
		this.id_articulo = id_articulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPvp() {
		return pvp;
	}
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
	
	
	
	
	
	
}
