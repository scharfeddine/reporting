package com.reporting.metier.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.reporting.metier.entities.OperateurInterco;


@Remote
public interface OperateurIntercoRemote {
	
	public List<OperateurInterco> getAllOperateurs();

}
