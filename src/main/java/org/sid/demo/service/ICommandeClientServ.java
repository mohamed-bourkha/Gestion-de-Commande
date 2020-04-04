package org.sid.demo.service;

import java.util.List;

import org.sid.demo.entities.CommandeClient;

public interface ICommandeClientServ {
	public CommandeClient save (CommandeClient entity);
	
	public CommandeClient update(CommandeClient entity);
	
	public CommandeClient getById(Long id);
	
	public List<CommandeClient> selectAll();
	
	public List<CommandeClient> selectAll(String sortField , String sort);
	
	public void remove(Long id);
	
	public CommandeClient findOne(String paramName , Object paramValue);
	
	public CommandeClient findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
	
}
