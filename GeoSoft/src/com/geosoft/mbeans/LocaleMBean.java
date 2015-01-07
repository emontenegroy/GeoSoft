package com.geosoft.mbeans;

import java.util.Locale;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

import com.geosoft.utils.General;

public class LocaleMBean{
	private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
	
	//Metodos
	@PostConstruct
    public void init() {
        locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
    }
	
	public void setLanguage(String language) {
        locale = new Locale(language);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
    }
	
    public String getLanguage() {
        return locale.getLanguage();
    }
	   
	//Getters and Setters
	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
}
