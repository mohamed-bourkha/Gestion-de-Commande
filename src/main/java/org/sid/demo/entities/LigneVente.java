package org.sid.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneVente implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLignevente;
	@ManyToOne
	@JoinColumn(name = "article_id")
	private Article article;
	@ManyToOne
	@JoinColumn(name = "vente_id")
	private Vente vente;

	public Long getIdLignevente() {
		return idLignevente;
	}

	public void setIdLignevente(Long idLignevente) {
		this.idLignevente = idLignevente;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public LigneVente(Article article, Vente vente) {
		super();
		this.article = article;
		this.vente = vente;
	}

	public LigneVente() {
		super();
	}

}
