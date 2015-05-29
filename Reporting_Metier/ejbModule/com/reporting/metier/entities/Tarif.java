package com.reporting.metier.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the tarifs database table.
 * 
 */
@Entity
@Table(name="tarifs",schema="tableref")
@NamedQuery(name="Tarif.findAll", query="SELECT t FROM Tarif t")
public class Tarif implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	

	
	@ManyToOne
	@JoinColumn(name="code_plan_tarif",referencedColumnName="code_plan_tarifaire",insertable=false,updatable=false)
	private PlanTarifaire plan;
	@ManyToOne
	@JoinColumn(name="type_palier",referencedColumnName="type_palier",insertable=false,updatable=false)
	private TypePalier Paliertype;
	
	@ManyToOne
	@JoinColumn(name="code_service",referencedColumnName="code_service",insertable=false,updatable=false)
	private Service service;
	@ManyToOne
	@JoinColumn(name="id_zone",referencedColumnName="id",insertable=false,updatable=false)
	private Zone zone;
	
	@ManyToOne
	@JoinColumn(name="id_package_zone",referencedColumnName="id",insertable=false,updatable=false)
	private PackageZone packZone;
	
	@ManyToOne
	@JoinColumn(name="id_package_jour",referencedColumnName="id",insertable=false,updatable=false)
	private PackageJour packJour;

	@Column(name="code_plan_tarif")
	private String codePlanTarif;

	@Column(name="code_service")
	private String codeService;

	@Temporal(TemporalType.DATE)
	@Column(name="date_debut_validite")
	private Date dateDebutValidite;

	@Column(name="date_modif")
	private Timestamp dateModif;

	@Column(name="id_interval")
	private Integer idInterval;

	@Column(name="id_package_jour")
	private Integer idPackageJour;

	@Column(name="id_package_zone")
	private Integer idPackageZone;

	

	@Column(name="id_zone")
	private Integer idZone;

	@Column(name="nom_utilisateur")
	private String nomUtilisateur;

	@Column(name="palier_taxation")
	private BigDecimal palierTaxation;

	@Column(name="prix_tarif")
	private BigDecimal prixTarif;

	@Column(name="type_palier")
	private Integer typePalier;

	public Tarif() {
	}
	
	
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	public Zone getZone() {
		return zone;
	}
	


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodePlanTarif() {
		return this.codePlanTarif;
	}

	public void setCodePlanTarif(String codePlanTarif) {
		this.codePlanTarif = codePlanTarif;
	}

	public String getCodeService() {
		return this.codeService;
	}

	public void setCodeService(String codeService) {
		this.codeService = codeService;
	}

	public Date getDateDebutValidite() {
		return this.dateDebutValidite;
	}

	public void setDateDebutValidite(Date dateDebutValidite) {
		this.dateDebutValidite = dateDebutValidite;
	}

	public Timestamp getDateModif() {
		return this.dateModif;
	}

	public void setDateModif(Timestamp dateModif) {
		this.dateModif = dateModif;
	}
	
	public Integer getIdInterval() {
		return this.idInterval;
	}

	public void setIdInterval(Integer idInterval) {
		this.idInterval = idInterval;
	}

	public Integer getIdPackageJour() {
		return this.idPackageJour;
	}

	public void setIdPackageJour(Integer idPackageJour) {
		this.idPackageJour = idPackageJour;
	}

	public Integer getIdPackageZone() {
		return this.idPackageZone;
	}

	public void setIdPackageZone(Integer idPackageZone) {
		this.idPackageZone = idPackageZone;
	}



	public Integer getIdZone() {
		return this.idZone;
	}

	public void setIdZone(Integer idZone) {
		this.idZone = idZone;
	}

	public String getNomUtilisateur() {
		return this.nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public BigDecimal getPalierTaxation() {
		return this.palierTaxation;
	}

	public void setPalierTaxation(BigDecimal palierTaxation) {
		this.palierTaxation = palierTaxation;
	}

	public BigDecimal getPrixTarif() {
		return this.prixTarif;
	}

	public void setPrixTarif(BigDecimal prixTarif) {
		this.prixTarif = prixTarif;
	}

	public Integer getTypePalier() {
		return this.typePalier;
	}

	public void setTypePalier(Integer typePalier) {
		this.typePalier = typePalier;
	}

}