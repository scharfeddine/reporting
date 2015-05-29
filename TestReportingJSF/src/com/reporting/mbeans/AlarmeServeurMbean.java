package com.reporting.mbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.reporting.metier.entities.AlarmsServ;
import com.reporting.metier.entities.Serveur;
import com.reporting.metier.interfaces.alarmeServeurRemote;


@ManagedBean(name="alarm_ser")
@ViewScoped
public class AlarmeServeurMbean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2671204427939345455L;

	@EJB
	private alarmeServeurRemote alarme_service;
	
	private List<Serveur> lstServeurs = new ArrayList<>();
	
	public List<Serveur> getLstServeurs() {
		return lstServeurs;
	}
	public void setLstServeurs(List<Serveur> lstServeurs) {
		this.lstServeurs = lstServeurs;
	}
	
	private AlarmsServ alarme;
	private AlarmsServ alarme1;
	
	public AlarmsServ getAlarme1() {
		return alarme1;
	}
	public void setAlarme1(AlarmsServ alarme1) {
		this.alarme1 = alarme1;
	}
	public AlarmsServ getAlarme() {
		return alarme;
	}
	public void setAlarme(AlarmsServ alarme) {
		this.alarme = alarme;
	}
	
	
	private List<AlarmsServ> liste_alarmes = new ArrayList<>();
	
	public List<AlarmsServ> getListe_alarmes() {
		return liste_alarmes;
	}
	public void setListe_alarmes(List<AlarmsServ> liste_alarmes) {
		this.liste_alarmes = liste_alarmes;
	}
	@PostConstruct
	public void init(){
		alarme = new AlarmsServ();
		alarme1= new AlarmsServ();
		lstServeurs = alarme_service.getAllServeurs();
		liste_alarmes =alarme_service.getAllAlarmesServeurs();
	}
	
	public void createAlarme(){
		alarme_service.addAlarme(alarme);
		liste_alarmes = alarme_service.getAllAlarmesServeurs();
		
	}
	public void modifAlarme(){
		alarme_service.updateAlarme(alarme1);
		liste_alarmes = alarme_service.getAllAlarmesServeurs();
	}
	public void deleteAlarme(){
		alarme_service.deleteAlarme(alarme1);
		liste_alarmes = alarme_service.getAllAlarmesServeurs();
	}
}
