package com.reporting.metier.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.reporting.metier.entities.TarifsInterTmp;
import com.reporting.metier.interfaces.TarifinterLcrRemote;

@Stateless
public class LcrService implements TarifinterLcrRemote {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void addLigne(TarifsInterTmp t) {
		// TODO Auto-generated method stub
		em.persist(t);
		
	}

}
