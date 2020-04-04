package org.sid.demo.service;

import java.util.List;

import org.sid.demo.entities.Client;

public interface IClientServ {
	public Client save (Client entity);
	
	public Client update(Client entity);
	
	public Client getById(Long id);
	
	public List<Client> selectAll();
	
	public List<Client> selectAll(String sortField , String sort);
	
	public void remove(Long id);
	
	public Client findOne(String paramName , Object paramValue);
	
	public Client findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
	
}
