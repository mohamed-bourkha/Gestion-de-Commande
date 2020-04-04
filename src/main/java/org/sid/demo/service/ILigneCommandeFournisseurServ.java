package org.sid.demo.service;

import java.util.List;

import org.sid.demo.entities.LigneCommandeFournisseur;

public interface ILigneCommandeFournisseurServ  {
	
	public LigneCommandeFournisseur save (LigneCommandeFournisseur entity);
	
	public LigneCommandeFournisseur update(LigneCommandeFournisseur entity);
	
	public LigneCommandeFournisseur getById(Long id);
	
	public List<LigneCommandeFournisseur> selectAll();
	
	public List<LigneCommandeFournisseur> selectAll(String sortField , String sort);
	
	public void remove(Long id);
	
	public LigneCommandeFournisseur findOne(String paramName , Object paramValue);
	
	public LigneCommandeFournisseur findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
	
}
