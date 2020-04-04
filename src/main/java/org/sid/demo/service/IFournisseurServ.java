package org.sid.demo.service;

import java.util.List;

import org.sid.demo.entities.Fournisseur;

public interface IFournisseurServ {

	public Fournisseur save(Fournisseur entity);

	public Fournisseur update(Fournisseur entity);

	public Fournisseur getById(Long id);

	public List<Fournisseur> selectAll();

	public List<Fournisseur> selectAll(String sortField, String sort);

	public void remove(Long id);

	public Fournisseur findOne(String paramName, Object paramValue);

	public Fournisseur findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
