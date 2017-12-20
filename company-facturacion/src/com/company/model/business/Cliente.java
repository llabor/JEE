package com.company.model.business;
/*
 * Autor: Juan Daniel Sánchez
 * Fecha: 22/11/2017
 * Descripción: 
 */
public class Cliente { 
	//Atributos
	private int id;  
	private String nombre;  
	private String apellido;      
	
	//Constructor
	public Cliente() {
		
	}
	
	//Getter y Setter
	public int getId() {
		return id;  
	}  
	public void setId(int id) {
		this.id = id;
		}  
	public String getNombre() {
		return nombre;  
		}  
	public void setNombre(String nombre) {
		this.nombre = nombre;  
		}  
	public String getApellido() {
		return apellido;  
		}  
	public void setApellido(String apellido) {
		this.apellido = apellido;  
		} 
	



}