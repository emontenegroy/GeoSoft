package com.geosoft.mbeans;

import java.util.Locale;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

public class LocaleMBean {
	private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
	private String junior = "Hola Soy Junior y estoy con Gabyta";

	
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
	
    public String editAction() {
  	  Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
  	  System.out.println(params);
  	  
  	 
  	  
  	  String action = params.get("j_id_jsp_223676087_2:j_id_jsp_223676087_3");
      System.out.println(action);
      return "";
    }
    
	//Getters and Setters
	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public String getJunior() {
		return junior;
	}

	public void setJunior(String junior) {
		this.junior = junior;
	}
	
}
