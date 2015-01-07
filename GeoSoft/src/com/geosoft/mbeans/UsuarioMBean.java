package com.geosoft.mbeans;

import java.util.ArrayList;
import java.util.List;

import com.geosoft.beans.UsuarioDTO;
import com.geosoft.services.UsuarioService;
import com.geosoft.utils.General;

public class UsuarioMBean extends General{
	//Navegacion
    private final String NAVIGATION_LISTAR = "loco?faces-redirect=true";
    private final String NAVIGATION_INSERTAR = "operadoraInsertar?faces-redirect=true";
    private final String NAVIGATION_ACTUALIZAR = "operadoraActualizar?faces-redirect=true";
    private final String NAVIGATION_ERROR = "";   
	
	//Variables Globales
	private UsuarioService servicioUsuario = new UsuarioService();
		
	//Constructor
	
	//Metodos
	public String login(){
		return "login";
		/*
		String usuario = getRequestParameterString("frmLogin:usuario");
		String clave = getRequestParameterString("frmLogin:clave");
		UsuarioDTO user = new UsuarioDTO(null, "", "", usuario, clave,null);
				
		System.out.println(usuario);
		System.out.println(clave);
		
		user=servicioUsuario.loguear(user);
		
		if(user!=null){
			System.out.println(NAVIGATION_LISTAR);
			return "login";
		}
		
		return NAVIGATION_ERROR;
		*/
	}
	
	//Getters and Setters
	
}
