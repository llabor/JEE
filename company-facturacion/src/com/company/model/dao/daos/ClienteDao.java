package com.company.model.dao.daos;
/*
 * Autor: Juan Daniel Sánchez
 * Fecha: 22/11/2017
 * Descripción: 
 */
import java.util.List;   //.UTIL SIEMPRE!!!!!

import com.company.model.business.Cliente;

public interface ClienteDao {
	//Declaración de métodos para acceder a la base de datos
	public void insertarCliente(Cliente cliente);
	public List<Cliente> obtenerClientes();
	public Cliente obtenerCliente(int id);
	public void actualizarCliente(Cliente cliente);
	public void eliminarCliente(Cliente cliente);
}
