package com.reporting.metier.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.reporting.metier.entities.Report;
import com.reporting.metier.entities.Template;
import com.reporting.metier.interfaces.TemplateRemote;

@Stateless
public class TemplateService implements TemplateRemote {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void AddTempate(Template t) {
		em.persist(t);
		
	}

	@Override
	public List<Template> getAllTemplates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateTemplate(Template T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTemplate(Template T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Template getTemplate(int id) {
		// TODO Auto-generated method stub
		return em.find(Template.class, id);
	}

}
