package com.banco.logica;

import com.banco.presentacion.Avisos;

/*
 * Autor: Ezequiel Llarena Borges
 * Fecha: 15/11/2017
 * Descripción: 
 */

public class CuentaCorriente extends Cuenta {
	
	//Atributos
	private float maximo;  			//Importe máximo a retirar
	private float comisiones;
	
	
	//Constructor
	public CuentaCorriente(String numCuenta, Persona titular, double saldo) {
		super(numCuenta, saldo, titular);
		this.numCuenta = new StringBuilder("11-").append(numCuenta);
		comisiones=0.01f;
		maximo=300;
	}
	//Métodos
	//retirar: Realiza la retirada de dinero siempre y cuando haya suficiente saldo.Además muestra por pantalla el saldo que queda.
	@Override
	public void retirar(double retirada){
		if(retirada > saldo)
		{
			Avisos.saldoInsuficiente();
		}
		else
		{	
			if (retirada>300){
				Avisos.mensajes((byte)2);
			}
			else{
				saldo = saldo - retirada-retirada*10*comisiones;
				for (int i = movimientos.length-2; i >=0 ; i--) {
					movimientos[i+1]=movimientos[i];			
				}
				movimientos[0]=-retirada;
				Avisos.cobroComisiones(retirada*10*comisiones);
				Avisos.consultaSaldo(saldo);
			}
		}
	}
	@Override
	public void ingresar(double ingreso){
		saldo += ingreso-ingreso*comisiones;
		for (int i = movimientos.length-2; i >=0 ; i--) {
			movimientos[i+1]=movimientos[i];			
		}
		movimientos[0]=ingreso;
		Avisos.cobroComisiones(ingreso*comisiones);
		Avisos.consultaSaldo(saldo);
	}
	//Getters y Setters
	public float getMaximo() {
		return maximo;
	}

	public void setMaximo(float maximo) {
		this.maximo = maximo;
	}

	public float getComisiones() {
		return comisiones;
	}

	public void setComisiones(float comisiones) {
		this.comisiones = comisiones;
	}

}
