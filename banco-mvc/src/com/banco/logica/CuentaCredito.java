package com.banco.logica;

import com.banco.presentacion.Avisos;

/*
 * Autor: Ezequiel Llarena Borges
 * Fecha: 15/11/2017
 * Descripción:
 */
public class CuentaCredito extends Cuenta {
	
	//Atributos
	private float limiteCredito;
	private float intereses;
	
	//Constructor
	public CuentaCredito(String numCuenta, Persona titular , double saldo) {
		super(numCuenta, saldo, titular);
		this.numCuenta = new StringBuilder("22-").append(numCuenta);
	}
	//Métodos
	//retirar: Realiza la retirada de dinero siempre y cuando haya suficiente saldo.Además muestra por pantalla el saldo que queda.
	@Override
	public void retirar(double retirada){
		if(retirada > saldo+limiteCredito)
		{
			Avisos.saldoInsuficiente();
		}
		else
		{	
			if (retirada>saldo){
				Avisos.mensajes((byte)3);
			}
			saldo = saldo - retirada;
			for (int i = movimientos.length-2; i >=0 ; i--) {
				movimientos[i+1]=movimientos[i];			
			}
			movimientos[0]=-retirada;
			Avisos.consultaSaldo(saldo);
			}
		}
	
	//ingresar: Realiza el ingreso de una determinada cantidad y muestra por pantalla el saldo disponible.
	@Override
	public void ingresar(double ingreso){ 
		saldo += ingreso;
		for (int i = movimientos.length-2; i >=0 ; i--) {
			movimientos[i+1]=movimientos[i];			
		}
		movimientos[0]=ingreso;
		
		Avisos.consultaSaldo(saldo);
	}
	
	//Getters y Setters
	public float getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public float getIntereses() {
		return intereses;
	}
	public void setIntereses(float intereses) {
		this.intereses = intereses;
	}
	

}
