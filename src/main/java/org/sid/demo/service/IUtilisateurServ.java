package org.sid.demo.service;

import java.util.List;


import org.sid.demo.entities.Utilisateur;

public interface IUtilisateurServ {
	public Utilisateur save (Utilisateur entity);
	
	public Utilisateur update(Utilisateur entity);
	
	public Utilisateur getById(Long id);
	
	public List<Utilisateur> selectAll();
	
	public List<Utilisateur> selectAll(String sortField , String sort);
	
	public void remove(Long id);
	
	public Utilisateur findOne(String paramName , Object paramValue);
	
	public Utilisateur findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
	
}
