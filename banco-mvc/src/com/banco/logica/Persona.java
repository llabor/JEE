package com.banco.logica;
/*
 * Autor: Ezequiel Llarena Borges
 * Fecha: 14/11/2017
 * Descripción: 
 */
public class Persona {
	//Atributos
	private String nombreCompleto;
	private String DNI;
	private boolean casado;
	
	//Constructores
	public Persona() {
		//super(); No es subclase de una clase definida por nosotros
	}
	public Persona(String nombreCompleto, String DNI) {
		//super();
		this.nombreCompleto = nombreCompleto;
		this.DNI = DNI;
	}


	//Tostring
	@Override
	public String toString() {
		return "Nombre: " + nombreCompleto + "| DNI: " + DNI;
	}	
	//Métodos Getters
	public String getNombreCompleto(){
		return nombreCompleto;
	}
	public String getDNI(){
		return DNI;
	}
	public boolean isCasado(){
		return casado;
	}
	//Métodos Setters
	public void setNombreCompleto(String nombreCompleto){
		this.nombreCompleto=nombreCompleto;
	}
	public void setDNI(String DNI){
		this.DNI=DNI;
	}
	public void setCasado(boolean casado){
		this.casado=casado;
	}
	//Equals and hasCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		result = prime * result + (casado ? 1231 : 1237);
		result = prime * result + ((nombreCompleto == null) ? 0 : nombreCompleto.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Persona)) {     //Para saber si un objeto pertenece a una clase
			return false;
		}
		Persona other = (Persona) obj;
		if (DNI == null) {
			if (other.DNI != null) {
				return false;
			}
		} else if (!DNI.equals(other.DNI)) {
			return false;
		}
		if (casado != other.casado) {
			return false;
		}
		if (nombreCompleto == null) {
			if (other.nombreCompleto != null) {
				return false;
			}
		} else if (!nombreCompleto.equals(other.nombreCompleto)) {
			return false;
		}
		return true;
	}

}
