package com.reporting.metier.interfaces;

import javax.ejb.Remote;

import com.reporting.metier.entities.TarifsInterTmp;

@Remote
public interface TarifinterLcrRemote {

	
	public void addLigne(TarifsInterTmp t);
}
