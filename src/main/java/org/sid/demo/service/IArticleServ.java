package org.sid.demo.service;

import java.util.List;

import org.sid.demo.entities.Article;

public interface IArticleServ {
	public Article save (Article entity);
	
	public Article update(Article entity);
	
	public Article getById(Long id);
	
	public List<Article> selectAll();
	
	public List<Article> selectAll(String sortField , String sort);
	
	public void remove(Long id);
	
	public Article findOne(String paramName , Object paramValue);
	
	public Article findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
	
}
