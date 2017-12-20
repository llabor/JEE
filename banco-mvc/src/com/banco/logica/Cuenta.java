package com.banco.logica;

import com.banco.presentacion.Avisos;

/*
 * Autor: Ezequiel Llarena Borges
 * Fecha: 14/11/2017
 * Descripción:
 */
public class Cuenta {
	//Atributos
	protected StringBuilder numCuenta;
	protected double saldo;
	private Persona titular;
	protected double[] movimientos = new double[10];

	//Constructor
	/*public Cuenta() {
		//super();					No es posible crear una cuenta sin datos
	}	*/
	public Cuenta(String numCuenta, double saldo, Persona titular) {
		//super();
		this.numCuenta = new StringBuilder(numCuenta);
		this.saldo = saldo;
		this.titular = titular;
		for (int i = 0; i < movimientos.length; i++) {
			movimientos[i]=0;
		}	
		}
	
	//Métodos
	//ingresar: Realiza el ingreso de una determinada cantidad y muestra por pantalla el saldo disponible.
	public void ingresar(double ingreso){ 
		saldo += ingreso;
		for (int i = movimientos.length-2; i >=0 ; i--) {
			movimientos[i+1]=movimientos[i];			
		}
		movimientos[0]=ingreso;
		
		Avisos.consultaSaldo(saldo);
	}
	
	//retirar: Realiza la retirada de dinero siempre y cuando haya suficiente saldo.Además muestra por pantalla el saldo que queda.
	public void retirar(double retirada){
		if(retirada > saldo)
		{
			Avisos.saldoInsuficiente();
		}
		else
		{
			saldo -= retirada;
			for (int i = movimientos.length-2; i >=0 ; i--) {
				movimientos[i+1]=movimientos[i];			
			}
			movimientos[0]=-retirada;
			Avisos.consultaSaldo(saldo);
		}
	}
	//Consulta de movimientos: Genera los ultimos 10 movimientos realizados
	public void consultaMovimientos(){
		Avisos.consultaSaldo(saldo);
		Avisos.infoMuestraMovimientos();
		for (int i = 0; i < movimientos.length; i++){
			Avisos.muestraSaldo(movimientos[i]);
		}
	}
	//Getters
	public StringBuilder getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(StringBuilder numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	//Setters
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Persona getTitular() {
		return titular;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	
	//Tostring
	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
	}
	
}
