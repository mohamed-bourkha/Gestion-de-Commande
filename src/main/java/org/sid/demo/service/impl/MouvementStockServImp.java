package org.sid.demo.service.impl;

import java.util.List;

import org.sid.demo.dao.IMouvementStockDao;
import org.sid.demo.entities.MouvementStock;
import org.sid.demo.service.IMouvementStockServ;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class MouvementStockServImp implements  IMouvementStockServ{

	private IMouvementStockDao dao;
	
	public void setDao(IMouvementStockDao dao) {
		this.dao = dao;
	}
	
	@Override
	public MouvementStock save(MouvementStock entity) {
		
		return dao.save(entity);
	}

	@Override
	public MouvementStock update(MouvementStock entity) {
		
		return dao.update(entity);
	}

	@Override
	public MouvementStock getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public List<MouvementStock> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<MouvementStock> selectAll(String sortField, String sort) {
		
		return dao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public MouvementStock findOne(String paramName, Object paramValue) {
		
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public MouvementStock findOne(String[] paramNames, Object[] paramValues) {
		
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return dao.findCountBy(paramName, paramValue);
	}

}
