package org.sid.demo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class CommandeFournisseur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCdeForunisseur;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	@ManyToOne
	@JoinColumn(name = "fournisseur_id")
	private Fournisseur fournisseur;
	@OneToMany(mappedBy = "commandefounisseur")
	private List<LigneCommandeFournisseur> lignecommandefournisseurs;

	public Long getIdCdeForunisseur() {
		return idCdeForunisseur;
	}

	public void setIdCdeForunisseur(Long idCdeForunisseur) {
		this.idCdeForunisseur = idCdeForunisseur;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public List<LigneCommandeFournisseur> getLignecommandefournisseurs() {
		return lignecommandefournisseurs;
	}

	public void setLigneCommandeFornisseurs(List<LigneCommandeFournisseur> lignecommandefournisseurs) {
		this.lignecommandefournisseurs = lignecommandefournisseurs;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CommandeFournisseur(Date dateCommande, Fournisseur fournisseur,
			List<LigneCommandeFournisseur> lignecommandefournisseurs) {
		super();
		this.dateCommande = dateCommande;
		this.fournisseur = fournisseur;
		this.lignecommandefournisseurs = lignecommandefournisseurs;
	}

	public CommandeFournisseur() {
		super();
	}

}
