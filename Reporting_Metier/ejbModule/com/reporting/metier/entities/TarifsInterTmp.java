package com.reporting.metier.entities;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the tarifs_inter_tmp database table.
 * 
 */
@Entity
@Table(name="tarifs_inter_tmp",schema="tables")
@NamedQuery(name="TarifsInterTmp.findAll", query="SELECT t FROM TarifsInterTmp t")
public class TarifsInterTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;

	@Column(name="code_dest")
	private String codeDest;

	@Temporal(TemporalType.DATE)
	@Column(name="date_validite")
	private Date dateValidite;

	private String destination;

	@Column(name="group_destination")
	private String groupDestination;

	@Column(name="id_pays")
	private Integer idPays;

	@Column(name="nom_fichier")
	private String nomFichier;

	

	private String qualite;

	private double tarifs;
	@ManyToOne
	@JoinColumn(name="operateur",referencedColumnName="id")
	private OperateurInterco operateur;

	public TarifsInterTmp() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodeDest() {
		return this.codeDest;
	}

	public void setCodeDest(String codeDest) {
		this.codeDest = codeDest;
	}

	public Date getDateValidite() {
		return this.dateValidite;
	}

	public void setDateValidite(Date dateValidite) {
		this.dateValidite = dateValidite;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getGroupDestination() {
		return this.groupDestination;
	}

	public void setGroupDestination(String groupDestination) {
		this.groupDestination = groupDestination;
	}

	public Integer getIdPays() {
		return this.idPays;
	}

	public void setIdPays(Integer idPays) {
		this.idPays = idPays;
	}

	public String getNomFichier() {
		return this.nomFichier;
	}

	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}

	public OperateurInterco getOperateur() {
		return operateur;
	}
	public void setOperateur(OperateurInterco operateur) {
		this.operateur = operateur;
	}

	public String getQualite() {
		return this.qualite;
	}

	public void setQualite(String qualite) {
		this.qualite = qualite;
	}

	public double getTarifs() {
		return this.tarifs;
	}

	public void setTarifs(double tarifs) {
		this.tarifs = tarifs;
	}

}