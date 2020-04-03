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

public class CommandeClient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCdeClient;
	private String code;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	@ManyToOne
	@JoinColumn(name = "client_id" )
	private Client client;
	@OneToMany(mappedBy = "commandeclient")
	private List<LigneCommandeClient> lignecommandeclients;

	public Long getIdCdeClient() {
		return idCdeClient;
	}

	public void setIdCdeClient(Long idCdeClient) {
		this.idCdeClient = idCdeClient;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<LigneCommandeClient> getLignecommandeclients() {
		return lignecommandeclients;
	}

	public void setLignecommandeclients(List<LigneCommandeClient> lignecommandeclients) {
		this.lignecommandeclients = lignecommandeclients;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CommandeClient(String code, Date dateCommande, Client client,
			List<LigneCommandeClient> lignecommandeclients) {
		super();

		this.code = code;
		this.dateCommande = dateCommande;
		this.client = client;
		this.lignecommandeclients = lignecommandeclients;
	}

	public CommandeClient() {
		super();
	}

}
