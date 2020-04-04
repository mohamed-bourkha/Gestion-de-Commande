package org.sid.demo.service;

import java.util.List;

import org.sid.demo.entities.MouvementStock;

public interface IMouvementStockServ {
	public MouvementStock save (MouvementStock entity);
	
	public MouvementStock update(MouvementStock entity);
	
	public MouvementStock getById(Long id);
	
	public List<MouvementStock> selectAll();
	
	public List<MouvementStock> selectAll(String sortField , String sort);
	
	public void remove(Long id);
	
	public MouvementStock findOne(String paramName , Object paramValue);
	
	public MouvementStock findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
	
}
