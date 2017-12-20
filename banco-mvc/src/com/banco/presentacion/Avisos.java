package com.banco.presentacion;

import com.banco.logica.CuentaCorriente;
import com.banco.logica.CuentaCredito;
import com.banco.logica.Persona;

/* 
 * Autor: Ezequiel Llarena Borges
 * Fecha: 15/11/2017
 * Descripción:
 */
public class Avisos {
	
	public static void saldoInsuficiente(){
		System.out.println("Saldo insuficiente.");
	}
	public static void consultaSaldo(double saldo){
		System.out.println("Su saldo es: " + String.format("%.2f", saldo) + "€");
	}
	public static void menuInicial(){
		System.out.println("¿Qué quieres hacer?");
		System.out.println("1 - Crear cliente");
		System.out.println("2 - Crear cuenta corriente");
		System.out.println("3 - Crear cuenta de credito");
		System.out.println("4 - Realizar movimientos");
		System.out.println("5 - Acceso Base de Datos");
		System.out.println("6 - Salir");
	}
	public static void menuBD(){
		System.out.println("1 - Mostrar listado de clientes");
		System.out.println("2 - Mostrar listado de cuentas corrientes");
		System.out.println("3 - Mostrar listado de cuentas de creditos");
		System.out.println("4 - Salir");
	}
	public static void numeroIncorrecto(){
		System.out.println("El numero introducido es erroneo, vuelva a introducir");
	}
	public static void menuMovimientos(){
		System.out.println("¿Qué quiere hacer?");
		System.out.println("1 - Ingresar");
		System.out.println("2 - Retirar");
		System.out.println("3 - Consultar Movimientos");
		System.out.println("4 - Salir");
	}
	public static void menuCrearCliente(){
		
		System.out.println();
	}
	public static void pedirNombre(){
		System.out.println("Introduzca su nombre:");
	}
	public static void pedirDNI(){
		System.out.println("Introduzca su DNI:");
	}
	public static void menuNuevoCliente(){
		System.out.println("¿Eres ya cliente?");
		System.out.println("1 - No");
		System.out.println("2 - Si");
	}
	public static void clienteCreado(){
		System.out.println("Cliente creado con éxito.");
	}
	public static void cuentaCreada(){
		System.out.println("Cuenta creada con éxito");
	}
	public static void clienteNoEncontrado(){
		System.out.println("Cliente no encontrado.");
	}
	public static void prueba(){
		System.out.println("prueba.");
	}
	public static void noCliente(){
		System.out.println("Usted no puede realizar movimientos");
	}
	public static void muestraPersona(Persona cliente){
		System.out.println(cliente);
	}
	public static void muestraCtaCorriente(CuentaCorriente cta){
	System.out.println("Nombre: " + cta.getTitular().getNombreCompleto() + " | Número de cuenta: " + cta.getNumCuenta() + " | Saldo: " + cta.getSaldo() + " | Comision: " + cta.getComisiones());
	}
	public static void muestraCtaCredito(CuentaCredito cta){
		System.out.println("Nombre: " + cta.getTitular().getNombreCompleto() + " | Número de cuenta: " + cta.getNumCuenta() + " | Saldo: " + cta.getSaldo());
		}
	public static void muestraSaldo(Double saldo){
		System.out.println(saldo);
	}
	public static void infoMuestraMovimientos(){
		System.out.println("A continuación se muestran los últimos 10 movimientos: ");
	}
	public static void mensajes(byte a){
		switch (a) {
		case 1:
			System.out.println("No hay archivos en la base de datos de este tipo.");
			break;
		case 2:
			System.out.println("El importe máximo que puede retirar es de 300€");
			break;
		case 3:
			System.out.println("Usted se va a quedar con un saldo negativo");
			break;
		default:
			break;
		}
	}
	public static void cobroComisiones(double numero){
		System.out.println("Esta operación tiene un coste de: " + String.format("%.2f", numero) + "€");
	}
}
