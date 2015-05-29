package com.reporting.metier.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.reporting.metier.entities.OperateurInterco;
import com.reporting.metier.interfaces.OperateurIntercoRemote;


@Stateless
public class OperateurIntercoService implements OperateurIntercoRemote {

	
	@PersistenceContext
	EntityManager em;

	@Override
	public List<OperateurInterco> getAllOperateurs() {
		// TODO Auto-generated method stub
		return em.createQuery("Select o from OperateurInterco o").getResultList();
	}
	
	
}
