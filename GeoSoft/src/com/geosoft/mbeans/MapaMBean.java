package com.geosoft.mbeans;

import java.util.List;

import com.geosoft.beans.HistoricaDTO;
import com.geosoft.beans.UsuarioDTO;
import com.geosoft.services.HistoricaService;
import com.geosoft.utils.General;
public class MapaMBean extends General{

	//Servicios
	private HistoricaService servicioHistorica = new HistoricaService();
	
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
	private void inicializarDatos() {
		
	}
	
	private void cargarDatos() {

	}

	//Obtener y Establecer

	
}
