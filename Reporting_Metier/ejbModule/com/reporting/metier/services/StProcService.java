package com.reporting.metier.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.reporting.metier.entities.Stproc;
import com.reporting.metier.interfaces.StProcRemote;


@Stateless
public class StProcService implements StProcRemote {

	
	@PersistenceContext
	EntityManager em;
	@Override
	public List<Stproc> getAllStProc() {
		// TODO Auto-generated method stub
		return em.createQuery("Select p from Stproc p").getResultList();
	}

	@Override
	public void arretProc(Stproc proc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activerProc(Stproc proc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changerCycle(Stproc proc) {
		// TODO Auto-generated method stub
		
	}

}
