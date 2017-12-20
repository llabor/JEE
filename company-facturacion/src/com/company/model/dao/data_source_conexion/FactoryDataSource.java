package com.company.model.dao.data_source_conexion;

public class FactoryDataSource {
	
	// Nombre de la conexión
	protected TipoConexion tipo;
		
	// Constructor que recibe el
	// tipo de la conexión
	public FactoryDataSource(TipoConexion tipo) {
		this.tipo = tipo;
	}
	
	// Retorna el objeto de conexión específico
	public Conexion createConexion(String bd, String usuario, String pwd) {
		Conexion miConexion;
		//if (tipo.equalsIgnoreCase("Oracle")) {
		if (tipo.equals(TipoConexion.ORACLE)) {			
			miConexion = new OracleConexion();
		} else if (tipo.equals(TipoConexion.SQLSERVER)) {
			miConexion = new SqlServerConexion();
		} else if (tipo.equals(TipoConexion.MYSQL)) {
			miConexion = new MySqlConexion();
		} else {
			throw new IllegalArgumentException("Tipo de conexión no válida.");
		}
		miConexion.conectar(bd, usuario, pwd);
		return miConexion;
	}
	
}
