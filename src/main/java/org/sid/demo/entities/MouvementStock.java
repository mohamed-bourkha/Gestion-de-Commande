package org.sid.demo.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class MouvementStock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMvtStock;
	private Date datemvt;
	private BigDecimal quantite;
	private int typeMvt;

	public Long getIdMvtStock() {
		return idMvtStock;
	}

	public void setIdMvtStock(Long idMvtStock) {
		this.idMvtStock = idMvtStock;
	}

	public Date getDatemvt() {
		return datemvt;
	}

	public void setDatemvt(Date datemvt) {
		this.datemvt = datemvt;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public int getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public MouvementStock(Date datemvt, BigDecimal quantite, int typeMvt) {
		super();
		this.datemvt = datemvt;
		this.quantite = quantite;
		this.typeMvt = typeMvt;
	}

	public MouvementStock() {
		super();
	}

}
