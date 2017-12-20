package com.company.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the articulo database table.
 * 
 */
@Entity
@NamedQuery(name="Articulo.findAll", query="SELECT a FROM Articulo a")
public class Articulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idarticulo;

	private String descripcion;

	private BigDecimal pvp;

	//bi-directional many-to-one association to DetalleHasArticulo
	@OneToMany(mappedBy="articulo")
	private List<DetalleHasArticulo> detalleHasArticulos;

	public Articulo() {
	}

	public int getIdarticulo() {
		return this.idarticulo;
	}

	public void setIdarticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPvp() {
		return this.pvp;
	}

	public void setPvp(BigDecimal pvp) {
		this.pvp = pvp;
	}

	public List<DetalleHasArticulo> getDetalleHasArticulos() {
		return this.detalleHasArticulos;
	}

	public void setDetalleHasArticulos(List<DetalleHasArticulo> detalleHasArticulos) {
		this.detalleHasArticulos = detalleHasArticulos;
	}

	public DetalleHasArticulo addDetalleHasArticulo(DetalleHasArticulo detalleHasArticulo) {
		getDetalleHasArticulos().add(detalleHasArticulo);
		detalleHasArticulo.setArticulo(this);

		return detalleHasArticulo;
	}

	public DetalleHasArticulo removeDetalleHasArticulo(DetalleHasArticulo detalleHasArticulo) {
		getDetalleHasArticulos().remove(detalleHasArticulo);
		detalleHasArticulo.setArticulo(null);

		return detalleHasArticulo;
	}

}