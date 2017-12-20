package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the detalle_has_articulo database table.
 * 
 */
@Entity
@Table(name="detalle_has_articulo")
@NamedQuery(name="DetalleHasArticulo.findAll", query="SELECT d FROM DetalleHasArticulo d")
public class DetalleHasArticulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DetalleHasArticuloPK id;

	private int cantidad;

	//bi-directional many-to-one association to Articulo
	@ManyToOne
	private Articulo articulo;

	//bi-directional many-to-one association to Detalle
	@ManyToOne
	private Detalle detalle;

	public DetalleHasArticulo() {
	}

	public DetalleHasArticuloPK getId() {
		return this.id;
	}

	public void setId(DetalleHasArticuloPK id) {
		this.id = id;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Detalle getDetalle() {
		return this.detalle;
	}

	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}

}