package com.company.model.dao.data_source_conexion;

import java.sql.ResultSet;

public class SqlServerConexion implements Conexion {
	
	//public SqlServerConexion() {}
	
	@Override
	public String descripcion() {
		return "Conexión a SQL Server";
	}
	@Override
	public void conectar(String bd, String usuario, String pwd){}
	@Override
	public ResultSet getQuery(String query){
		return null;
	}
	@Override
	public boolean setQuery(String query){
		return false;
	}
	@Override
	public void cerrarConexion(){}
}
