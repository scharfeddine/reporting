package com.reporting.mbeans;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.component.accordionpanel.AccordionPanel;

@ManagedBean
@SessionScoped
public class TabMenuNavigationBean implements Serializable {

	
	
	private Long activeIndex;
	
	

	public Long getActiveIndex() {
		return activeIndex;
	}

	public void setActiveIndex(Long activeIndex) {
		this.activeIndex = activeIndex;
	}
	
	@PostConstruct
	public void init(){
		activeIndex=(long) 0;
	}
 private boolean pan_admin= false;
 private boolean pan_reporting = false;
 
 public boolean isPan_admin() {
	return pan_admin;
}
 public boolean isPan_reporting() {
	return pan_reporting;
}
 public void setPan_admin(boolean pan_admin) {
	this.pan_admin = pan_admin;
}
 public void setPan_reporting(boolean pan_reporting) {
	this.pan_reporting = pan_reporting;
}
	private boolean pan_prepayé = false;
	
	public boolean isPan_prepayé() {
		return pan_prepayé;
	}
	public void setPan_prepayé(boolean pan_prepayé) {
		this.pan_prepayé = pan_prepayé;
	}
	
	public void changeActiveIndex(Long x){
		activeIndex=x;
		if(x==0){
			pan_prepayé=false;
			pan_reporting=false;
			pan_admin=true;
		}
if(x==1){
	pan_prepayé=true;
			pan_admin=false;
			pan_reporting=false;
		}
		if(x==2){
			pan_prepayé=false;
			pan_admin=false;
			pan_reporting=true;
		}
				
			
			
		
	}
	
	
}
