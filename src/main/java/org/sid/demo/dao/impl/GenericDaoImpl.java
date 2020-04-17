package org.sid.demo.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.sid.demo.dao.IGenericDao;

@SuppressWarnings("unchecked")
public class GenericDaoImpl<E> implements IGenericDao<E> {
	@PersistenceContext
	EntityManager em ;
	
	private Class<E> type;

	// getter of Class<E>
	public Class<E> getType() {
		return type;
	}

	// Constructor
	public GenericDaoImpl() {
		java.lang.reflect.Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class<E>) pt.getActualTypeArguments()[0];
	}

	
	
	@Override
	public E save(E entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public E update(E entity) {
		return em.merge(entity);
	}

	@Override
	public E getById(Long id) {
		return em.find(type, id);
	}

	@Override
	public List<E> selectAll() {
		Query query = em.createQuery("select t from" + type.getSimpleName() + " t");
		return query.getResultList();
	}

	@Override
	public List<E> selectAll(String sortField, String sort) {
		Query query = em.createQuery("select t from" + type.getSimpleName() +"t order by"  + sortField + " " + sort);
		return query.getResultList();
	}

	@Override
	public void remove(Long id) {
		E tab = em.getReference(type, id);
		em.remove(tab);

		
	}

	@Override
	public E findOne(String paramName, Object paramValue) {
		Query query = em.createQuery("select t from " + type.getSimpleName() + "t where " + paramName + " =  :x");
		query.setParameter(paramName, paramValue);
		if (query.getResultList().size() > 0) {
			return (E) query.getResultList().get(0);
		}
		return null;
	}

	@Override
	public E findOne(String[] paramNames, Object[] paramValues) {
		if (paramNames.length != paramValues.length) {
			return null;
		}
		String queryString = "select e from " + type.getSimpleName() + "e where";
		int len = paramNames.length;
		for (int i = 0; i < len; i++) {
			queryString += "e." + paramNames[i] + "= :x" + i;
			if ((i + 1) < len) {
				queryString += " and ";
			}

		}
		Query query = em.createQuery(queryString);
		for (int i = 0; i < paramValues.length; i++) {
			query.setParameter("x" + 1, paramValues[i]);
		}
		return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;
	}
	

	@Override
	public int findCountBy(String paramName, String paramValue) {
		Query query = em.createQuery("select t from" + type.getSimpleName() + " t where " + paramName + " = :x");
		query.setParameter(paramName, paramValue);
		return query.getResultList().size() > 0 ? ((Long) query.getSingleResult()).intValue() : 0;
	}

}
