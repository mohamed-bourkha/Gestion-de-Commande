package org.sid.demo.service.impl;

import java.util.List;

import org.sid.demo.dao.ILigneCommandeFournisseurDao;
import org.sid.demo.entities.LigneCommandeFournisseur;
import org.sid.demo.service.ILigneCommandeFournisseurServ;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class LigneCommandeFournisseurServImp implements ILigneCommandeFournisseurServ {
	
	
	private ILigneCommandeFournisseurDao dao;
	
	public void setDao(ILigneCommandeFournisseurDao dao) {
		this.dao = dao;
	}
	
	@Override
	public LigneCommandeFournisseur save(LigneCommandeFournisseur entity) {
		
		return dao.save(entity);
	}

	@Override
	public LigneCommandeFournisseur update(LigneCommandeFournisseur entity) {
		
		return dao.update(entity);
	}

	@Override
	public LigneCommandeFournisseur getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public List<LigneCommandeFournisseur> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<LigneCommandeFournisseur> selectAll(String sortField, String sort) {
		
		return dao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public LigneCommandeFournisseur findOne(String paramName, Object paramValue) {
		
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCommandeFournisseur findOne(String[] paramNames, Object[] paramValues) {
		
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return dao.findCountBy(paramName, paramValue);
	}

}
