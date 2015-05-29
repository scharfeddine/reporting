package com.reporting.metier.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.reporting.metier.entities.ZonesDestination;
@Remote
public interface ZoneDestinationRemote {

	
	public List<ZonesDestination> getAllZonesDestination();
	
	public void addZonesDestination(ZonesDestination dest);
	public void deleteZonesDestination(ZonesDestination dest);
	
	public void updateZonesDestination(ZonesDestination dest);
}
