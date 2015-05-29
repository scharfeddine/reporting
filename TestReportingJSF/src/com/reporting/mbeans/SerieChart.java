package com.reporting.mbeans;

import java.io.Serializable;
import java.util.Map;

public class SerieChart implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	private Map<Object,Number> map;
	
	
	public Map<Object, Number> getMap() {
		return map;
	}
	public String getName() {
		return name;
	}
	public void setMap(Map<Object, Number> map) {
		this.map = map;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
