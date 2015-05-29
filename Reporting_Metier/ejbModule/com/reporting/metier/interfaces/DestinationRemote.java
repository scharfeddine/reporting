package com.reporting.metier.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.reporting.metier.entities.Destination;


@Remote
public interface DestinationRemote  {

	
	public List<Destination> getAllDestination();
	
	public void addDestination(Destination dest);
	public void deleteDestination(Destination dest);
	
	public void updateDestination(Destination dest);
}
