package com.company.model.dao.data_source_conexion;

import java.sql.ResultSet;

public interface Conexion {
		
	public String descripcion();
	public void conectar(String bd, String usuario, String pwd);
	public ResultSet getQuery(String query);
	public boolean setQuery(String query);
	public void cerrarConexion();

}
