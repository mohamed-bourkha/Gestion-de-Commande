package org.sid.demo.service.impl;

import java.util.List;

import org.sid.demo.dao.ICommandeFournisseurDao;
import org.sid.demo.entities.CommandeFournisseur;
import org.sid.demo.service.ICommandeFournisseurServ;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class CommandeFournisseurServImp implements ICommandeFournisseurServ {

	
	private ICommandeFournisseurDao dao;
	
	//Setter of the object dao
	public void setDao(ICommandeFournisseurDao dao) {
		this.dao = dao;
	}
	
	
	@Override
	public CommandeFournisseur save(CommandeFournisseur entity) {
		
		return dao.save(entity);
	}

	@Override
	public CommandeFournisseur update(CommandeFournisseur entity) {
		
		return dao.update(entity);
	}

	@Override
	public CommandeFournisseur getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public List<CommandeFournisseur> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<CommandeFournisseur> selectAll(String sortField, String sort) {
		
		return dao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		
		dao.remove(id);
	}

	@Override
	public CommandeFournisseur findOne(String paramName, Object paramValue) {
		
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public CommandeFournisseur findOne(String[] paramNames, Object[] paramValues) {
		
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return dao.findCountBy(paramName, paramValue);
	}

}
