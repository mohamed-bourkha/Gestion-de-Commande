package org.sid.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Fournisseur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFournisseur;
	private String nom;
	private String prenom;
	private String adresse;
	private String photo;
	private String email;
	@OneToMany(mappedBy = "fournisseur")
	private List<CommandeFournisseur> commandefournisseurs;

	public Long getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<CommandeFournisseur> getCommandefournisseurs() {
		return commandefournisseurs;
	}

	public void setCommandefournisseurs(List<CommandeFournisseur> commandefournisseurs) {
		this.commandefournisseurs = commandefournisseurs;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Fournisseur(String nom, String prenom, String adresse, String photo, String email,
			List<CommandeFournisseur> commandefournisseurs) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.photo = photo;
		this.email = email;
		this.commandefournisseurs = commandefournisseurs;
	}

	public Fournisseur() {
		super();
	}

}
