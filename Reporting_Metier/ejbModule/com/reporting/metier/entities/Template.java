package com.reporting.metier.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(schema="tableref")
public class Template implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_template;
	
	private String nom_template;
	
	
	@ManyToOne
	@JoinColumn(name="operateur_id",referencedColumnName="id")
	private OperateurInterco operateur;
	
	private int NbFeuilles ;
	private int Tarif_Feuille;
	private int Dest_Feuille;
	private int lignesIgnore_Tarif;
	private int lignesIgnore_Dest;
	private boolean ColDate;
	private boolean RowDate;
	private int num_ligneDate;
	private int num_colDate;
	private boolean SepPaysDest;
	private boolean PaysinDest;
	private String Carac_SepChiffre;
	private boolean DestJustOne;
	private String Carac_SepDestCompose;
	private boolean Plage_Separateur;
	private String Carac_SepDest;
	private String format_date;
	private String format_tarif;
	private String DestColRow;
	private String CodeDestColRow;
	private String CodePaysColRow;
	private String DateEffColRow;
	private String TarifColRow;
	private String qualityColRow;
	public int getId_template() {
		return id_template;
	}
	public void setId_template(int id_template) {
		this.id_template = id_template;
	}
	public String getNom_template() {
		return nom_template;
	}
	public void setNom_template(String nom_template) {
		this.nom_template = nom_template;
	}
	public OperateurInterco getOperateur() {
		return operateur;
	}
	public void setOperateur(OperateurInterco operateur) {
		this.operateur = operateur;
	}
	public int getNbFeuilles() {
		return NbFeuilles;
	}
	public void setNbFeuilles(int nbFeuilles) {
		NbFeuilles = nbFeuilles;
	}
	public int getTarif_Feuille() {
		return Tarif_Feuille;
	}
	public void setTarif_Feuille(int tarif_Feuille) {
		Tarif_Feuille = tarif_Feuille;
	}
	public int getDest_Feuille() {
		return Dest_Feuille;
	}
	public void setDest_Feuille(int dest_Feuille) {
		Dest_Feuille = dest_Feuille;
	}
	public int getLignesIgnore_Tarif() {
		return lignesIgnore_Tarif;
	}
	public void setLignesIgnore_Tarif(int lignesIgnore_Tarif) {
		this.lignesIgnore_Tarif = lignesIgnore_Tarif;
	}
	public int getLignesIgnore_Dest() {
		return lignesIgnore_Dest;
	}
	public void setLignesIgnore_Dest(int lignesIgnore_Dest) {
		this.lignesIgnore_Dest = lignesIgnore_Dest;
	}
	public boolean isColDate() {
		return ColDate;
	}
	public void setColDate(boolean colDate) {
		ColDate = colDate;
	}
	public boolean isRowDate() {
		return RowDate;
	}
	public void setRowDate(boolean rowDate) {
		RowDate = rowDate;
	}
	public int getNum_ligneDate() {
		return num_ligneDate;
	}
	public void setNum_ligneDate(int num_ligneDate) {
		this.num_ligneDate = num_ligneDate;
	}
	public int getNum_colDate() {
		return num_colDate;
	}
	public void setNum_colDate(int num_colDate) {
		this.num_colDate = num_colDate;
	}
	public boolean isSepPaysDest() {
		return SepPaysDest;
	}
	public void setSepPaysDest(boolean sepPaysDest) {
		SepPaysDest = sepPaysDest;
	}
	public boolean isPaysinDest() {
		return PaysinDest;
	}
	public void setPaysinDest(boolean paysinDest) {
		PaysinDest = paysinDest;
	}
	public String getCarac_SepChiffre() {
		return Carac_SepChiffre;
	}
	public void setCarac_SepChiffre(String carac_SepChiffre) {
		Carac_SepChiffre = carac_SepChiffre;
	}
	public boolean isDestJustOne() {
		return DestJustOne;
	}
	public void setDestJustOne(boolean destJustOne) {
		DestJustOne = destJustOne;
	}
	public String getCarac_SepDestCompose() {
		return Carac_SepDestCompose;
	}
	public void setCarac_SepDestCompose(String carac_SepDestCompose) {
		Carac_SepDestCompose = carac_SepDestCompose;
	}
	public boolean isPlage_Separateur() {
		return Plage_Separateur;
	}
	public void setPlage_Separateur(boolean plage_Separateur) {
		Plage_Separateur = plage_Separateur;
	}
	public String getCarac_SepDest() {
		return Carac_SepDest;
	}
	public void setCarac_SepDest(String carac_SepDest) {
		Carac_SepDest = carac_SepDest;
	}
	public String getFormat_date() {
		return format_date;
	}
	public void setFormat_date(String format_date) {
		this.format_date = format_date;
	}
	public String getFormat_tarif() {
		return format_tarif;
	}
	public void setFormat_tarif(String format_tarif) {
		this.format_tarif = format_tarif;
	}
	public String getDestColRow() {
		return DestColRow;
	}
	public void setDestColRow(String destColRow) {
		DestColRow = destColRow;
	}
	public String getCodeDestColRow() {
		return CodeDestColRow;
	}
	public void setCodeDestColRow(String codeDestColRow) {
		CodeDestColRow = codeDestColRow;
	}
	public String getCodePaysColRow() {
		return CodePaysColRow;
	}
	public void setCodePaysColRow(String codePaysColRow) {
		CodePaysColRow = codePaysColRow;
	}
	public String getDateEffColRow() {
		return DateEffColRow;
	}
	public void setDateEffColRow(String dateEffColRow) {
		DateEffColRow = dateEffColRow;
	}
	public String getTarifColRow() {
		return TarifColRow;
	}
	public void setTarifColRow(String tarifColRow) {
		TarifColRow = tarifColRow;
	}
	public String getQualityColRow() {
		return qualityColRow;
	}
	public void setQualityColRow(String qualityColRow) {
		this.qualityColRow = qualityColRow;
	}

	
	
	
	

}
