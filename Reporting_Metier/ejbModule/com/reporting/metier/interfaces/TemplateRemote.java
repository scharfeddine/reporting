package com.reporting.metier.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.reporting.metier.entities.Template;

@Remote
public interface TemplateRemote {
	
	public void AddTempate(Template t);
	
	public List<Template> getAllTemplates();
	public Template getTemplate(int id);
	public void updateTemplate(Template T);
	public void deleteTemplate(Template T);
	

}
