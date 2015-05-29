package com.reporting.metier.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the package_zones database table.
 * 
 */
@Entity
@Table(name="package_zones",schema="tableref")
@NamedQuery(name="PackageZone.findAll", query="SELECT p FROM PackageZone p")
public class PackageZone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="code_package")
	private String codePackage;

	@Column(name="date_modif")
	private Timestamp dateModif;

	@Column(name="date_modification")
	private Timestamp dateModification;

	private String nom;

	@Column(name="nom_utilisateur")
	private String nomUtilisateur;

	public PackageZone() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodePackage() {
		return this.codePackage;
	}

	public void setCodePackage(String codePackage) {
		this.codePackage = codePackage;
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