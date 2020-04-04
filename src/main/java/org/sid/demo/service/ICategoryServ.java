package org.sid.demo.service;

import java.util.List;

import org.sid.demo.entities.Category;

public interface ICategoryServ {
	public Category save (Category entity);
	
	public Category update(Category entity);
	
	public Category getById(Long id);
	
	public List<Category> selectAll();
	
	public List<Category> selectAll(String sortField , String sort);
	
	public void remove(Long id);
	
	public Category findOne(String paramName , Object paramValue);
	
	public Category findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
	
}
