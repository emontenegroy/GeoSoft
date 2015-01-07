package com.geosoft.mbeans;

import com.geosoft.beans.UsuarioDTO;
import com.geosoft.services.UsuarioService;
import com.geosoft.utils.General;

public class UsuarioMBean extends General{
	//Servicios
	private UsuarioService servicioUsuario = new UsuarioService();
	
	//Navegacion
	private final String NAVIGATION_LOGIN = "login";
	private final String NAVIGATION_ERROR = "";

	//Variables Globales
	
		
	//Constructor
	
	
	//Metodos
	public String login(){
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
		
		return NAVIGATION_ERROR;
	}
	
	//Obtener y Establecer
	
}
