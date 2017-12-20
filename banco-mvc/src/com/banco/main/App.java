package com.banco.main;
/*
 * Autor: Ezequiel Llarena Borges
 * Fecha: 14/11/2017
 * Descripción:
 */
import com.banco.datos.BaseDatos;
import com.banco.logica.CuentaCorriente;
import com.banco.logica.CuentaCredito;
import com.banco.logica.Persona;
import com.banco.presentacion.Avisos;

import java.util.Scanner;

public class App {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		BaseDatos basedatos = new BaseDatos();
		byte menuinicio;
		boolean salir=false;

		do {
			Avisos.menuInicial();
			menuinicio = teclado.nextByte();
			switch(menuinicio){
				case 1:
					App.crearCliente(basedatos);
					break;
				case 2:
					App.crearCuentaCorriente(basedatos);
					break;
				case 3:
					App.crearCuentaCredito(basedatos);
					break;
				case 4:
					App.menumovimientos(basedatos);
					break;
				case 5:
					App.accesoBD(basedatos);					
					break;
				case 6:
					salir=true;
					break;
				default:
					Avisos.numeroIncorrecto();
						
			}
			
		} while (!salir);
	
		System.out.println("Adios");
		teclado.close();
	}

public static void muestraCuentaCorriente(BaseDatos basedatos){
	basedatos.devuelveCuentaCorriente();
}
public static void muestraCuentaCredito(BaseDatos basedatos){
	basedatos.devuelveCuentaCredito();
}
public static void muestraclientes(BaseDatos basedatos){
	basedatos.devuelveCliente();	
}
public static void menumovimientos(BaseDatos basedatos){
	byte opcion;
	String nombre;
	Persona cliente = new Persona();
	CuentaCorriente cta;

	Avisos.menuNuevoCliente();
	opcion = teclado.nextByte();
	if (opcion==1){
		Avisos.noCliente();
	}
	else{
		Avisos.pedirDNI();
		nombre = teclado.next();
		cliente = basedatos.buscaCliente(nombre);
		if(cliente==null){
			Avisos.clienteNoEncontrado();
		}
		else{
			cta=basedatos.buscaCtaCorriente(cliente);
			if(cta==null){
				Avisos.clienteNoEncontrado();
			}
			else{
				App.movimientos(cta);
			}
		}
	}
}
public static void movimientos(CuentaCorriente ctaCte){
	byte menumovimientos;
	double dinero;
	do{
		Avisos.menuMovimientos();
		menumovimientos = teclado.nextByte();
		switch (menumovimientos) {
			case 1:
				System.out.println("¿Cuanto quiere ingresar?");
				dinero = teclado.nextDouble();
				ctaCte.ingresar(dinero);
				break;
			case 2:
				System.out.println("¿Cuanto quiere retirar");
				dinero = teclado.nextDouble();
				ctaCte.retirar(dinero);
				break;
			case 3:
				ctaCte.consultaMovimientos();
				break;
			case 4:
				break;
			default:
				Avisos.numeroIncorrecto();
				break;
			}
	}while(menumovimientos!=4);
}
public static Persona crearCliente(BaseDatos basedatos){
	String nombre,DNI;
	Persona cliente;
	
	Avisos.pedirNombre();
	nombre = teclado.next();
	Avisos.pedirDNI();
	DNI = teclado.next();
	cliente = new Persona(nombre,DNI);
	basedatos.añadirPersona(cliente);
	Avisos.clienteCreado();
	return cliente;
}
public static void crearCuentaCorriente(BaseDatos basedatos){
	byte opcion;
	String nombre;
	String num;
	Persona cliente;
	CuentaCorriente cta;
	Avisos.menuNuevoCliente();
	opcion = teclado.nextByte();
	if (opcion==1){
		cliente = App.crearCliente(basedatos);
		num = String.valueOf(Math.random()).substring(3, 10);
		cta = new CuentaCorriente(num,cliente, 0);
		basedatos.añadirCuentaCorriente(cta);
		Avisos.cuentaCreada();
	}
	else{
		Avisos.pedirDNI();
		nombre = teclado.next();
		cliente = basedatos.buscaCliente(nombre);
		if(cliente==null){
			Avisos.clienteNoEncontrado();
		}
		else{
			num = String.valueOf(Math.random()).substring(3, 10);
			cta = new CuentaCorriente(num,cliente, 0) ;
			basedatos.añadirCuentaCorriente(cta);
			Avisos.cuentaCreada();
		}
			
		
	}
}
public static void crearCuentaCredito(BaseDatos basedatos){
	byte opcion;
	String nombre;
	String num;
	Persona cliente;
	CuentaCredito cta;
	Avisos.menuNuevoCliente();
	opcion = teclado.nextByte();
	if (opcion==1){
		cliente = App.crearCliente(basedatos);
		num = String.valueOf(Math.random()).substring(3, 10);
		cta = new CuentaCredito(num,cliente, 0);
		basedatos.añadirCuentaCredito(cta);
		Avisos.cuentaCreada();
	}
	else{
		Avisos.pedirDNI();
		nombre = teclado.next();
		cliente = basedatos.buscaCliente(nombre);
		if(cliente==null){
			Avisos.clienteNoEncontrado();
		}
		else{
			num = String.valueOf(Math.random()).substring(3, 10);
			cta = new CuentaCredito(num,cliente, 0) ;
			basedatos.añadirCuentaCredito(cta);
			Avisos.cuentaCreada();
		}
			
		
	}
}
public static void accesoBD(BaseDatos basedatos){
	byte menu=0;
	boolean salir=false;
	
	do {
		Avisos.menuBD();
		menu = teclado.nextByte();
		switch (menu) {
			case 1:
				App.muestraclientes(basedatos);
				break;
			case 2:
				App.muestraCuentaCorriente(basedatos);
				break;
			case 3:
				App.muestraCuentaCredito(basedatos);
				break;
			case 4:
				salir=true;
				break;
			default:
				Avisos.numeroIncorrecto();
				break;
		}
		
	} while (!salir);
	
}
}