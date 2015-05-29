package com.reporting.metier.entities;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the zones database table.
 * 
 */
@Entity
@Table(name="zones",schema="tableref")
@NamedQuery(name="Zone.findAll", query="SELECT z FROM Zone z")
public class Zone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	


	@Column(name="code_zones")
	private String codeZones;

	@Column(name="date_modif")
	private Timestamp dateModif;

	@Column(name="date_modification")
	private Timestamp dateModification;

	@Column(name="id_package")
	private Integer idPackage;

	private String nom;

	@Column(name="nom_utilisateur")
	private String nomUtilisateur;

	public Zone() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodeZones() {
		return this.codeZones;
	}

	public void setCodeZones(String codeZones) {
		this.codeZones = codeZones;
	}

	public Timestamp getDateModif() {
		return this.dateModif;
	}

	public void setDateModif(Timestamp dateModif) {
		this.dateModif = dateModif;
	}

	public Timestamp getDateModification() {
		return this.dateModification;
	}

	public void setDateModification(Timestamp dateModification) {
		this.dateModification = dateModification;
	}

	public Integer getIdPackage() {
		return this.idPackage;
	}

	public void setIdPackage(Integer idPackage) {
		this.idPackage = idPackage;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomUtilisateur() {
		return this.nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

}