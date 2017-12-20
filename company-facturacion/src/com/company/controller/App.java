package com.company.controller;

import com.company.model.business.Cliente;
import com.company.model.dao.dao_impl.ClienteDaoImpl;
import com.company.model.dao.data_source_conexion.Conexion;
import com.company.model.dao.data_source_conexion.FactoryDataSource;
import com.company.model.dao.data_source_conexion.TipoConexion;

public class App {
	//Datos de la Base de Datos
	 private static String usuario = "root";
	 private static String pwd = "root";
	 private static String bd = "company";
	 public static Conexion miConexion;

	 
	public static void main(String[] args){
		
		FactoryDataSource miFabrica;
		ClienteDaoImpl f_cliente = new ClienteDaoImpl();
		
		//Conectamos con la base de datos
		miFabrica = new FactoryDataSource(TipoConexion.MYSQL);
		miConexion = miFabrica.createConexion(bd, usuario, pwd);
		System.out.println("Está conectado con: " + miConexion.descripcion());
		
		//Insertamos un cliente
		Cliente cliente = new Cliente();
		cliente.setNombre("José");
		cliente.setApellido("Sánchez");
		f_cliente.insertarCliente(cliente);
		//Obtener lista cliente

		miConexion.cerrarConexion();    // !!!!!!!!!!!!!!!
		
	}

	
}