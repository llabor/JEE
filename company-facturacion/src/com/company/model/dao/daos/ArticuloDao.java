package com.company.model.dao.daos;

import java.util.List;

import com.company.model.business.Articulo;


/*
 * Autor: Juan Daniel Sánchez
 * Fecha: 22/11/2017
 * Descripción: 
 */
public interface ArticuloDao {
	
	// CRUD
	public void insertarArticulo(Articulo articulo);
	public List<Articulo> obtenerArticulo();
	public Articulo obtenerArticulo(int id);
	public void actualizarArticulo(Articulo articulo);
	public void eliminarCliente(Articulo articulo);

}
