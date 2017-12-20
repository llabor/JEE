package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the detalle database table.
 * 
 */
@Entity
@NamedQuery(name="Detalle.findAll", query="SELECT d FROM Detalle d")
public class Detalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int iddetalle;

	//bi-directional many-to-one association to Factura
	@ManyToOne
	private Factura factura;

	//bi-directional many-to-one association to DetalleHasArticulo
	@OneToMany(mappedBy="detalle")
	private List<DetalleHasArticulo> detalleHasArticulos;

	public Detalle() {
	}

	public int getIddetalle() {
		return this.iddetalle;
	}

	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public List<DetalleHasArticulo> getDetalleHasArticulos() {
		return this.detalleHasArticulos;
	}

	public void setDetalleHasArticulos(List<DetalleHasArticulo> detalleHasArticulos) {
		this.detalleHasArticulos = detalleHasArticulos;
	}

	public DetalleHasArticulo addDetalleHasArticulo(DetalleHasArticulo detalleHasArticulo) {
		getDetalleHasArticulos().add(detalleHasArticulo);
		detalleHasArticulo.setDetalle(this);

		return detalleHasArticulo;
	}

	public DetalleHasArticulo removeDetalleHasArticulo(DetalleHasArticulo detalleHasArticulo) {
		getDetalleHasArticulos().remove(detalleHasArticulo);
		detalleHasArticulo.setDetalle(null);

		return detalleHasArticulo;
	}

}