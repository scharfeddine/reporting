package com.reporting.metier.entities;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.math.BigDecimal;


/**
 * The persistent class for the stat_taxe_prp database table.
 * 
 */
@Entity
@Table(name="stat_taxe_prp",schema="stat")
@NamedQuery(name="StatTaxePrp.findAll", query="SELECT s FROM StatTaxePrp s")
public class StatTaxePrp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_stat_prp")
	private Integer idStatPrp;

	@Column(name="date_appel")
	private String dateAppel;

	@Column(name="duree_taxe")
	private BigDecimal dureeTaxe;

	@Column(name="duree_total")
	private BigDecimal dureeTotal;

	@Column(name="nb_appel_total")
	private BigDecimal nbAppelTotal;

	@Column(name="nb_taxe")
	private BigDecimal nbTaxe;

	@ManyToOne
	@JoinColumn(name="plan_tarifaire",referencedColumnName="code_plan_tarifaire",insertable=false,updatable=false)
	private PlanTarifaire plan;
	
	@ManyToOne 
	@JoinColumn(name="type_dest",referencedColumnName="id",insertable=false,updatable=false)
	private TypeDestination destination;
	
	@Column(name="plan_tarifaire")
	private String planTarifaire;

	@Column(name="type_dest")
	private Long typeDest;

	public StatTaxePrp() {
	}

	public Integer getIdStatPrp() {
		return this.idStatPrp;
	}

	public void setIdStatPrp(Integer idStatPrp) {
		this.idStatPrp = idStatPrp;
	}

	public String getDateAppel() {
		return this.dateAppel;
	}

	public void setDateAppel(String dateAppel) {
		this.dateAppel = dateAppel;
	}

	public BigDecimal getDureeTaxe() {
		return this.dureeTaxe;
	}

	public void setDureeTaxe(BigDecimal dureeTaxe) {
		this.dureeTaxe = dureeTaxe;
	}

	public BigDecimal getDureeTotal() {
		return this.dureeTotal;
	}

	public void setDureeTotal(BigDecimal dureeTotal) {
		this.dureeTotal = dureeTotal;
	}

	public BigDecimal getNbAppelTotal() {
		return this.nbAppelTotal;
	}

	public void setNbAppelTotal(BigDecimal nbAppelTotal) {
		this.nbAppelTotal = nbAppelTotal;
	}

	public BigDecimal getNbTaxe() {
		return this.nbTaxe;
	}

	public void setNbTaxe(BigDecimal nbTaxe) {
		this.nbTaxe = nbTaxe;
	}

	public String getPlanTarifaire() {
		return this.planTarifaire;
	}

	public void setPlanTarifaire(String planTarifaire) {
		this.planTarifaire = planTarifaire;
	}

	public Long getTypeDest() {
		return this.typeDest;
	}

	public void setTypeDest(Long typeDest) {
		this.typeDest = typeDest;
	}
	public PlanTarifaire getPlan() {
		return plan;
	}
	public void setPlan(PlanTarifaire plan) {
		this.plan = plan;
	}
	public TypeDestination getDestination() {
		return destination;
	}
	public void setDestination(TypeDestination destination) {
		this.destination = destination;
	}

}