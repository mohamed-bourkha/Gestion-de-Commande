package org.sid.demo.service;

import java.util.List;


import org.sid.demo.entities.LigneVente;

public interface ILigneVenteServ {
	public LigneVente save (LigneVente entity);
	
	public LigneVente update(LigneVente entity);
	
	public LigneVente getById(Long id);
	
	public List<LigneVente> selectAll();
	
	public List<LigneVente> selectAll(String sortField , String sort);
	
	public void remove(Long id);
	
	public LigneVente findOne(String paramName , Object paramValue);
	
	public LigneVente findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
	
}
