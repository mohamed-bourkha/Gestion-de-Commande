package org.sid.demo.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class LigneCommandeFournisseur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLigneCdeFrn;
	@ManyToOne
	@JoinColumn(name = "article_id")
	private Article article;
	@ManyToOne
	@JoinColumn(name = "commandefour_id")
	private CommandeFournisseur commandefounisseur;

	public Long getIdLigneCdeFrn() {
		return idLigneCdeFrn;
	}

	public void setIdLigneCdeFrn(Long idLigneCdeFrn) {
		this.idLigneCdeFrn = idLigneCdeFrn;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeFournisseur getCommandefounisseur() {
		return commandefounisseur;
	}

	public void setCommandefounisseur(CommandeFournisseur commandefounisseur) {
		this.commandefounisseur = commandefounisseur;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public LigneCommandeFournisseur(Article article, CommandeFournisseur commandefounisseur) {
		super();
		this.article = article;
		this.commandefounisseur = commandefounisseur;
	}

	public LigneCommandeFournisseur() {
		super();
	}

}
