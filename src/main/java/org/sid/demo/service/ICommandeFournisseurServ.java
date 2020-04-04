package org.sid.demo.service;

import java.util.List;

import org.sid.demo.entities.CommandeFournisseur;

public interface ICommandeFournisseurServ {
	public CommandeFournisseur save (CommandeFournisseur entity);
	
	public CommandeFournisseur update(CommandeFournisseur entity);
	
	public CommandeFournisseur getById(Long id);
	
	public List<CommandeFournisseur> selectAll();
	
	public List<CommandeFournisseur> selectAll(String sortField , String sort);
	
	public void remove(Long id);
	
	public CommandeFournisseur findOne(String paramName , Object paramValue);
	
	public CommandeFournisseur findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
	
}
