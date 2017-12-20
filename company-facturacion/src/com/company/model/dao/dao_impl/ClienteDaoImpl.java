package com.company.model.dao.dao_impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.company.controller.App;
import com.company.model.business.Cliente;
import com.company.model.dao.daos.ClienteDao;

public class ClienteDaoImpl implements ClienteDao {
	
	public void insertarCliente(Cliente cliente){
		if (App.miConexion.setQuery("INSERT INTO cliente (nombre,apellido) VALUES ('"
								+ cliente.getNombre() + "','" + cliente.getApellido() + "');")){
			System.out.println("Cliente insertado correctamente!");
		} else {
			System.out.println("No se pudo insertar el cliente."); 
		}
	}
	
	public List<Cliente> obtenerClientes(){
		
		ResultSet datos;
		List<Cliente> clientes = new ArrayList<>();
		Cliente cliente = new Cliente();
		
	    datos = App.miConexion.getQuery("SELECT * FROM cliente;");
	    try {
	      while(datos.next()) { // ver nombres de campos en tablas !!
	    	  cliente.setId(Integer.parseInt(datos.getString("codigo")));
	    	  cliente.setApellido(datos.getString("apellido"));
	    	  cliente.setNombre(datos.getString("nombre"));
	    	  clientes.add(cliente);
	      }
	    }
	    catch (SQLException e) { e.printStackTrace();
	   }  
	    return clientes;
	}
	
	public Cliente obtenerCliente(int id){
		return null;
	}
	
	public void actualizarCliente(Cliente cliente){
		
	}
	
	public void eliminarCliente(Cliente cliente){
		
	}

	
}
