package org.sid.demo.service;

import java.util.List;

import org.sid.demo.entities.Vente;

public interface IVenteServ {
	public Vente save (Vente entity);
	
	public Vente update(Vente entity);
	
	public Vente getById(Long id);
	
	public List<Vente> selectAll();
	
	public List<Vente> selectAll(String sortField , String sort);
	
	public void remove(Long id);
	
	public Vente findOne(String paramName , Object paramValue);
	
	public Vente findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
	
}
