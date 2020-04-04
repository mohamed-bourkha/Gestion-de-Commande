package org.sid.demo.service.impl;

import java.util.List;

import org.sid.demo.dao.IArticleDao;
import org.sid.demo.entities.Article;
import org.sid.demo.service.IArticleServ;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ArticleServImp implements IArticleServ {

	private IArticleDao dao;

	public void setDao(IArticleDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Article save(Article entity) {

		return dao.save(entity);
	}

	@Override
	public Article update(Article entity) {
		
		return dao.update(entity);
	}

	@Override
	public Article getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public List<Article> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<Article> selectAll(String sortField, String sort) {
		
		return dao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public Article findOne(String paramName, Object paramValue) {
		
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Article findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return dao.findCountBy(paramName, paramValue);
	}

}
