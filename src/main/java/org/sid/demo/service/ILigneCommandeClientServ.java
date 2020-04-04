package org.sid.demo.service;

import java.util.List;

import org.sid.demo.entities.LigneCommandeClient;

public interface ILigneCommandeClientServ {
	public LigneCommandeClient save (LigneCommandeClient entity);
	
	public LigneCommandeClient update(LigneCommandeClient entity);
	
	public LigneCommandeClient getById(Long id);
	
	public List<LigneCommandeClient> selectAll();
	
	public List<LigneCommandeClient> selectAll(String sortField , String sort);
	
	public void remove(Long id);
	
	public LigneCommandeClient findOne(String paramName , Object paramValue);
	
	public LigneCommandeClient findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
	
}
