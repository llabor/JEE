package com.company.model.dao.data_source_conexion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestFabrica {
	//Datos de la Base de Datos
	 private static String usuario;
	 private static String pwd;
	 private static String bd;
	 private static Conexion miConexion;
	 
	 public static Properties property;
	
	public static void main(String[] args) {
		
		FactoryDataSource miFabrica;
		miFabrica = new FactoryDataSource(TipoConexion.MYSQL);
		
		try {
			property.load(new FileInputStream("D:\\workspace_j2ee\\company-v2\\src\\com\\company\\properties\\parametros-conexion.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		usuario = property.getProperty("usuario");
		pwd = property.getProperty("pwd");
		bd = property.getProperty("bd");
		miConexion = miFabrica.createConexion(bd, usuario, pwd);
		System.out.println("nombre-bd:" + bd);
		System.out.println(usuario);
		System.out.println(pwd);
		System.out.println("Está conectado con: " +
		                    miConexion.descripcion());
	}
}
