package org.sid.demo.service.impl;

import java.util.List;

import org.sid.demo.dao.ILigneVenteDao;
import org.sid.demo.entities.LigneVente;
import org.sid.demo.service.ILigneVenteServ;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class LigneVenteServImp implements ILigneVenteServ {

	private ILigneVenteDao dao;
	
	public void setDao(ILigneVenteDao dao) {
		this.dao = dao;
	}
	
	@Override
	public LigneVente save(LigneVente entity) {
		
		return dao.save(entity);
	}

	@Override
	public LigneVente update(LigneVente entity) {
		
		return dao.update(entity);
	}

	@Override
	public LigneVente getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public List<LigneVente> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<LigneVente> selectAll(String sortField, String sort) {
		
		return dao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public LigneVente findOne(String paramName, Object paramValue) {
		
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneVente findOne(String[] paramNames, Object[] paramValues) {
		
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return dao.findCountBy(paramName, paramValue);
	}

}
