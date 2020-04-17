package org.sid.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class LigneCommandeClient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLigneCdeClt;
	@ManyToOne
	@JoinColumn(name = "article_id")
	private Article article;
	@ManyToOne
	@JoinColumn(name = "commandeclt_id")
	private CommandeClient commandeclient;

	public Long getIdLigneCdeClt() {
		return idLigneCdeClt;
	}

	public void setIdLigneCdeClt(Long idLigneCdeClt) {
		this.idLigneCdeClt = idLigneCdeClt;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeClient getCommandeclient() {
		return commandeclient;
	}

	public void setCommandeclient(CommandeClient commandeclient) {
		this.commandeclient = commandeclient;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public LigneCommandeClient(Article article, CommandeClient commandeclient) {
		super();
		this.article = article;
		this.commandeclient = commandeclient;
	}

	public LigneCommandeClient() {
		super();
	}

}
