package com.geosoft.utils;

import java.math.BigInteger;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


public class General {
	//General
	protected ExternalContext getExternalContext() {
        FacesContext context = FacesContext.getCurrentInstance();
        return context.getExternalContext();
    }
	
	protected HttpSession getSession(boolean create) {
		//true=crea una session nueva y false=retorna la session actual
        return (HttpSession) getExternalContext().getSession(create);
    }
	
	//Metodos Parametros    
    protected String getRequestParameterString(String param) {
        try {
            String parametro = null;
            parametro = ((String) getExternalContext().getRequestParameterMap().get(param)).toString();
            return parametro;
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage()+" Param: "+param);
        }
        return null;
    }    
    protected Character getRequestParameterChar(String param) {
        try {
            String parametro = null;
            parametro = ((String) getExternalContext().getRequestParameterMap().get(param)).toString();            
            return parametro.charAt(0);
        } catch (Exception e) {
        	System.out.println("Error "+e.getMessage()+" Param: "+param);
        }
        return null;
    }    
    protected int getRequestParameterInt(String param) {
        try {
            int parametro = 0;
            parametro = Integer.parseInt(getExternalContext().getRequestParameterMap().get(param));
            return parametro;
        } catch (Exception e) {
        	System.out.println("Error "+e.getMessage()+" Param: "+param);
        }
        return -1;
    }
    protected BigInteger getRequestParameterBigInteger(String param) {
        try {
            BigInteger parametro = new BigInteger(getExternalContext().getRequestParameterMap().get(param));
            return parametro;
        } catch (Exception e) {
        	System.out.println("Error "+e.getMessage()+" Param: "+param);
        }
        return null;
    }
    protected Short getRequestParameterShort(String param) {
        try {
            Short parametro = 0;
            parametro = Short.parseShort(getExternalContext().getRequestParameterMap().get(param));
            return parametro;
        } catch (Exception e) {
        	System.out.println("Error "+e.getMessage()+" Param: "+param);
        }
        return -1;
    }
    protected long getRequestParameterLong(String param) {
        try {
            long parametro = 0;
            parametro = Long.parseLong(getExternalContext().getRequestParameterMap().get(param));
            return parametro;
        } catch (Exception e) {
        	System.out.println("Error "+e.getMessage()+" Param: "+param);
        }
        return -1;
    }
    protected double getRequestParameterDouble(String param) {
        try {
            double parametro = 0;
            parametro = Double.parseDouble(getExternalContext().getRequestParameterMap().get(param));
            return parametro;
        } catch (Exception e) {
        	System.out.println("Error "+e.getMessage()+" Param: "+param);
        }
        return -1;
    }
    protected boolean getRequestParameterBoolean(String param) {
        try {
            boolean parametro = false;
            parametro = Boolean.parseBoolean(getExternalContext().getRequestParameterMap().get(param));
            return parametro;
        } catch (Exception e) {
        	System.out.println("Error "+e.getMessage()+" Param: "+param);
        }
        return false;
    }
    
}
