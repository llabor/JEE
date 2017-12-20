package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the detalle_has_articulo database table.
 * 
 */
@Embeddable
public class DetalleHasArticuloPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="detalle_iddetalle", insertable=false, updatable=false)
	private int detalleIddetalle;

	@Column(name="articulo_idarticulo", insertable=false, updatable=false)
	private int articuloIdarticulo;

	public DetalleHasArticuloPK() {
	}
	public int getDetalleIddetalle() {
		return this.detalleIddetalle;
	}
	public void setDetalleIddetalle(int detalleIddetalle) {
		this.detalleIddetalle = detalleIddetalle;
	}
	public int getArticuloIdarticulo() {
		return this.articuloIdarticulo;
	}
	public void setArticuloIdarticulo(int articuloIdarticulo) {
		this.articuloIdarticulo = articuloIdarticulo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DetalleHasArticuloPK)) {
			return false;
		}
		DetalleHasArticuloPK castOther = (DetalleHasArticuloPK)other;
		return 
			(this.detalleIddetalle == castOther.detalleIddetalle)
			&& (this.articuloIdarticulo == castOther.articuloIdarticulo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.detalleIddetalle;
		hash = hash * prime + this.articuloIdarticulo;
		
		return hash;
	}
}