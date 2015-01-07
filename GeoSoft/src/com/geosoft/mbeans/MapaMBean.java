package com.geosoft.mbeans;

import com.geosoft.services.UsuarioService;
import com.geosoft.utils.General;

public class MapaMBean  extends General{

	//Servicios
	private UsuarioService servicioUsuario = new UsuarioService();
	
	//Navegacion
	/*
    private final String NAVIGATION_LISTAR = "loco?faces-redirect=true";
    private final String NAVIGATION_INSERTAR = "operadoraInsertar?faces-redirect=true";
    private final String NAVIGATION_ACTUALIZAR = "operadoraActualizar?faces-redirect=true";
    private final String NAVIGATION_ERROR = "";   
	*/
	
	//Variables Globales
	
	
	//Constructor
	public MapaMBean() {
		System.out.println("MapaMBean - Inicio");
		inicializarDatos();
        cargarDatos();
        System.out.println("MapaMBean - Fin");
	}
	
	//Metodos
	private void cargarDatos() {
		
	}

	private void inicializarDatos() {
		
	}
	
	//Obtener y Establecer

	
}
