package com.banco.datos;
import java.util.ArrayList;
import java.util.List;

/*
 * Autor: Juan Daniel S�nchez
 * Fecha: 15/11/2017
 * Descripci�n: Contiene los arrays con la informaci�n de los clientes
 * y las diferentes cuentas
 */
import com.banco.logica.CuentaCorriente;
import com.banco.logica.CuentaCredito;
import com.banco.logica.Persona;
import com.banco.presentacion.Avisos;

public class BaseDatos {
	//Atributos
	final byte MAX_CLIENTES=10;
	List<Persona> listaClientes = new ArrayList<Persona>();
	List<CuentaCorriente> listaCtaCorriente = new ArrayList<CuentaCorriente>();
	List<CuentaCredito> listaCtaCredito = new ArrayList<>();
	CuentaCredito[] ctacredito = new CuentaCredito[MAX_CLIENTES];


	
//M�todos
//A�ade un nuevo cliente a la base de datos
public void a�adirPersona(Persona cliente){
	listaClientes.add(cliente);
}
//A�ade una nueva cuenta corriente a la base de datos
public void a�adirCuentaCorriente(CuentaCorriente cta){
	listaCtaCorriente.add(cta);

}
//A�ade una cuenta de credito a la base de datos
public void a�adirCuentaCredito(CuentaCredito cta){
	listaCtaCredito.add(cta);
}
//Devuelve la cuenta corriente perteneciente al cliente que se le pasa
public CuentaCorriente buscaCtaCorriente(Persona cliente){

	for(CuentaCorriente a: listaCtaCorriente) {
        if(cliente.equals(a.getTitular())){
        	return a;
        }
    }
	return null;

}
//Devuelve un cliente a partir de un nombre
public Persona buscaCliente(String nombre){
	 for(Persona a: listaClientes) {
         if(nombre.equals(a.getDNI())){
        	 return a;
         }
     }
	return null;

}
//Imprime por pantalla todos los clientes de la base de datos
public void devuelveCliente(){
	for(Persona a: listaClientes) {
		Avisos.muestraPersona(a);
	}	
}
//Imprime por pantalla todas las cuentas corrientes.
public void devuelveCuentaCorriente(){
	if (listaCtaCorriente.size()==0){
		Avisos.mensajes((byte)1);
	}
	else{
		for(CuentaCorriente a: listaCtaCorriente) {
			Avisos.muestraCtaCorriente(a);
		    }
	}

}
public void devuelveCuentaCredito(){
	if (listaCtaCredito.size()==0){
		Avisos.mensajes((byte)1);
	}
	else{
		for(CuentaCredito a: listaCtaCredito) {
			Avisos.muestraCtaCredito(a);
		    }
	}

}
	
}