package com.reporting.mbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.reporting.metier.entities.ZonesDestination;
import com.reporting.metier.interfaces.DestinationRemote;
import com.reporting.metier.interfaces.ZoneDestinationRemote;

@ManagedBean(name="zoneDest")
@ViewScoped
public class ZoneDestinationMbean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private ZoneDestinationRemote ZonesDestinationService;
	
	private List<ZonesDestination> liste_ZonesDestinations= new ArrayList<>();
	
	private ZonesDestination ZonesDestination;
	private ZonesDestination ZonesDestination1;
	
	
	public List<ZonesDestination> getListe_ZonesDestinations() {
		return liste_ZonesDestinations;
	}
	public void setListe_ZonesDestinations(List<ZonesDestination> liste_ZonesDestinations) {
		this.liste_ZonesDestinations = liste_ZonesDestinations;
	}
	public void setZonesDestination(ZonesDestination ZonesDestination) {
		this.ZonesDestination = ZonesDestination;
	}
	public void setZonesDestination1(ZonesDestination ZonesDestination1) {
		this.ZonesDestination1 = ZonesDestination1;
	}
	public ZonesDestination getZonesDestination() {
		return ZonesDestination;
	}
	public ZonesDestination getZonesDestination1() {
		return ZonesDestination1;
	}
	@PostConstruct
	public void init(){
		liste_ZonesDestinations= ZonesDestinationService.getAllZonesDestination();
		ZonesDestination = new ZonesDestination();
		ZonesDestination1= new ZonesDestination();
	}
	
	public void addZonesDestination(){
		ZonesDestinationService.addZonesDestination(ZonesDestination);
		liste_ZonesDestinations= ZonesDestinationService.getAllZonesDestination();
		ZonesDestination = new ZonesDestination();
	}
public void DeleteZonesDestination(){
		ZonesDestinationService.deleteZonesDestination(ZonesDestination1);
		liste_ZonesDestinations= ZonesDestinationService.getAllZonesDestination();
	}
public void updateZonesDestination(){
	ZonesDestinationService.updateZonesDestination(ZonesDestination1);
	liste_ZonesDestinations= ZonesDestinationService.getAllZonesDestination();
}
}
