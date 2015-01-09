package com.geosoft.mbeans;

import java.sql.Date;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.geosoft.beans.UsuarioDTO;
import com.geosoft.services.UsuarioService;
import com.geosoft.utils.General;

public class UsuarioMBean extends General{
	//Servicios
	private UsuarioService servicioUsuario = new UsuarioService();
	
	//Navegacion
	private final String NAVIGATION_LOGIN = "login";
	private final String NAVIGATION_LOGOUT = "logout";
	private final String NAVIGATION_ERROR = "";

	//Variables Globales
	
		
	//Constructor
	
	
	//Metodos
	public String login(){
		System.out.println("UsuarioMBean - login - Inicio");
		String usuario = getRequestParameterString("frmLogin:usuario");
		String clave = getRequestParameterString("frmLogin:clave");
		UsuarioDTO user = new UsuarioDTO(null, "", "", usuario, clave,null);

		//Por Ahora System.out.println hasta en un futuro implemetar Loj4J
		System.out.println("Usuario: "+usuario);
		System.out.println("Clave: "+clave);
		
		user=servicioUsuario.loguear(user);
		
		if(user!=null){
			getSession(false).setAttribute("user", user);
			return NAVIGATION_LOGIN;
		}
		
		System.out.println("UsuarioMBean - login - Inicio");
		return NAVIGATION_ERROR;
	}
	
	public String logout() throws Exception {
        System.out.println("UsuarioMBean - logout - Inicio");                                           
        FacesContext context;
        HttpSession session;
        
        context = FacesContext.getCurrentInstance();
        session = (HttpSession) context.getExternalContext().getSession(false);
        if (session != null) {            
            session.invalidate();
        }       
        System.out.println("UsuarioMBean - logout - Fin");
        return NAVIGATION_LOGOUT;
    }
	
	//Obtener y Establecer
	
}
