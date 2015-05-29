package com.reporting.mbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.reporting.metier.entities.Destination;
import com.reporting.metier.entities.DetailsDestination;
import com.reporting.metier.entities.TypeDestination;
import com.reporting.metier.interfaces.DestinationRemote;
import com.reporting.metier.interfaces.TypeDestinationRemote;


@ManagedBean(name="dest_manage")
@ViewScoped
public class DestinationMbean {
	
	@EJB
	private DestinationRemote dest_service;
	
	@EJB
	private TypeDestinationRemote type_dest_service;
	
	private List<Destination> liste_destination = new ArrayList<>();
	private DetailsDestination detail = new DetailsDestination();
	private List<DetailsDestination> listeDetails = new ArrayList<>();
	private List<DetailsDestination> listeDetails1 = new ArrayList<>();
	
	private List<TypeDestination> liste_typeDest = new ArrayList<>();
	private Destination destination = new Destination();
	private Destination destination1 = new Destination();
	
	public DetailsDestination getDetail() {
		return detail;
	}
	public void setDetail(DetailsDestination detail) {
		this.detail = detail;
	}
	public List<DetailsDestination> getListeDetails() {
		return listeDetails;
	}
	public List<DetailsDestination> getListeDetails1() {
		return listeDetails1;
	}
	public void setListeDetails(List<DetailsDestination> listeDetails) {
		this.listeDetails = listeDetails;
	}
	public void setListeDetails1(List<DetailsDestination> listeDetails1) {
		this.listeDetails1 = listeDetails1;
	}
	public Destination getDestination() {
		return destination;
	}
	public Destination getDestination1() {
		return destination1;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	public void setDestination1(Destination destination1) {
		this.destination1 = destination1;
	}
	public List<Destination> getListe_destination() {
		return liste_destination;
	}
	public void setListe_destination(List<Destination> liste_destination) {
		this.liste_destination = liste_destination;
	}
	public List<TypeDestination> getListe_typeDest() {
		return liste_typeDest;
	}
	public void setListe_typeDest(List<TypeDestination> liste_typeDest) {
		this.liste_typeDest = liste_typeDest;
	}
	@PostConstruct
	public void init(){
		
		liste_destination= dest_service.getAllDestination();
liste_typeDest= type_dest_service.getAllTypeDest();
			
		

		
	}
	
	public void addDestination(){
		
		dest_service.addDestination(destination);
		liste_destination= dest_service.getAllDestination();
	}
	public void setDetailList(){
		listeDetails.add(detail);
		destination.setLst_details(listeDetails);
	}

}
