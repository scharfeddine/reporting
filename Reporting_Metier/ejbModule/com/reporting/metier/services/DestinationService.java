package com.reporting.metier.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.reporting.metier.entities.Destination;
import com.reporting.metier.entities.ZonesDestination;
import com.reporting.metier.interfaces.DestinationRemote;
import com.reporting.metier.interfaces.ZoneDestinationRemote;


@Stateless
public class DestinationService implements DestinationRemote,ZoneDestinationRemote {

	
	@PersistenceContext
	EntityManager em;
	@Override
	public List<Destination> getAllDestination() {
		// TODO Auto-generated method stub
		return em.createQuery("Select d  From Destination d").getResultList();
	}

	@Override
	public void addDestination(Destination dest) {
		em.persist(dest);
		
	}

	@Override
	public void deleteDestination(Destination dest) {
		em.remove(dest);
		
	}

	@Override
	public void updateDestination(Destination dest) {
	em.merge(dest);
	}

	@Override
	public List<ZonesDestination> getAllZonesDestination() {
		// TODO Auto-generated method stub
		return em.createQuery("Select d  From ZonesDestination d").getResultList();
	}

	@Override
	public void addZonesDestination(ZonesDestination dest) {
		// TODO Auto-generated method stub
		em.persist(dest);
	}

	@Override
	public void deleteZonesDestination(ZonesDestination dest) {
		// TODO Auto-generated method stub
		em.remove(em.contains(dest) ? dest : em.merge(dest));
	}

	@Override
	public void updateZonesDestination(ZonesDestination dest) {
		// TODO Auto-generated method stub
		em.merge(dest);
	}

}
