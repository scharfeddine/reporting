package com.reporting.mbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.reporting.metier.entities.OperateurInterco;
import com.reporting.metier.entities.Template;
import com.reporting.metier.interfaces.OperateurIntercoRemote;
import com.reporting.metier.interfaces.TemplateRemote;

@ManagedBean(name="lcr")
@ViewScoped
public class LcrMbean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private OperateurIntercoRemote operateurService;
	
	@EJB
	private TemplateRemote template_service;
	  private int currentLevel = 1;  
	

	    public int getCurrentLevel() {  
	        return currentLevel;  
	    }  
	  
	    public void setCurrentLevel(int currentLevel) {  
	        this.currentLevel = currentLevel;  
	    }  
	  
	
	private OperateurInterco operateur;
	private List<OperateurInterco> lst_operateurs = new ArrayList<>();
	
	private Template template;
	public Template getTemplate() {
		return template;
	}
	
	public void setTemplate(Template template) {
		this.template = template;
	}
	
	@PostConstruct
	public void init(){
		
		lst_operateurs=operateurService.getAllOperateurs();
		operateur= new OperateurInterco();
		template= new Template();
		
	}
	
	
	public void saveTemplate(){
		System.out.println("Begin");
		template_service.AddTempate(template);
		System.out.println("End");
		
		
	}
	
	
	
	
	





	public OperateurInterco getOperateur() {
		return operateur;
	}







	public void setOperateur(OperateurInterco operateur) {
		this.operateur = operateur;
	}







	public List<OperateurInterco> getLst_operateurs() {
		return lst_operateurs;
	}







	public void setLst_operateurs(List<OperateurInterco> lst_operateurs) {
		this.lst_operateurs = lst_operateurs;
	}












}
