  package org.sid.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity

public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private String photo;
	private String email;
	@OneToMany (mappedBy = "client")
	private List<CommandeClient> commandclients;
	
	
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
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
	public List<CommandeClient> getCommandclients() {
		return commandclients;
	}
	public void setCommandclients(List<CommandeClient> commandclients) {
		this.commandclients = commandclients;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Client(String nom, String prenom, String adresse, String photo, String email,
			List<CommandeClient> commandclients) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.photo = photo;
		this.email = email;
		this.commandclients = commandclients;
	}
	public Client() {
		super();
	}

	
	
	
}
