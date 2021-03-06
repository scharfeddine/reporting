package com.reporting.metier.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the package_jours database table.
 * 
 */
@Entity
@Table(name="package_jours",schema="tableref")
@NamedQuery(name="PackageJour.findAll", query="SELECT p FROM PackageJour p")
public class PackageJour implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="code_pakage")
	private String codePakage;

	@Column(name="date_modif")
	private Timestamp dateModif;

	private String nom;

	@Column(name="nom_utilisateur")
	private String nomUtilisateur;

	public PackageJour() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodePakage() {
		return this.codePakage;
	}

	public void setCodePakage(String codePakage) {
		this.codePakage = codePakage;
	}

	public Timestamp getDateModif() {
		return this.dateModif;
	}

	public void setDateModif(Timestamp dateModif) {
		this.dateModif = dateModif;
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