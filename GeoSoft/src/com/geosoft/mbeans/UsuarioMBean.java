package com.geosoft.mbeans;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.geosoft.beans.HistoricaDTO;
import com.geosoft.beans.UsuarioDTO;
import com.geosoft.services.HistoricaService;
import com.geosoft.services.UsuarioService;
import com.geosoft.utils.General;

public class UsuarioMBean extends General{
	//Servicios
	private UsuarioService servicioUsuario = new UsuarioService();
	private HistoricaService servicioHistorica = new HistoricaService();
	
	//Navegacion
	private final String NAVIGATION_LOGIN = "login";
	private final String NAVIGATION_LOGOUT = "logout";
	private final String NAVIGATION_ERROR = "";

	//Variables Globales
	private List<HistoricaDTO> listaMonitoreo;
		
	//Constructor
	public UsuarioMBean() {
		System.out.println("UsuarioMBean - Inicio");
		inicializarDatos();
        cargarDatos();
        System.out.println("UsuarioMBean - Fin");
	}
	
	//Metodos
	private void inicializarDatos() {
		
	}
	
	private void cargarDatos() {
		
	}
	
	//Metodos
	public String login(){
		System.out.println("UsuarioMBean - login - Inicio");
		String usuario = getRequestParameterString("frmLogin:usuario");
		String clave = getRequestParameterString("frmLogin:clave");
		UsuarioDTO user = new UsuarioDTO(null, "", "", usuario, clave,null);
		
		System.out.println("usuario: "+usuario);
		System.out.println("clave: "+clave);
		
		user=servicioUsuario.loguear(user);
		
		if(user!=null){
			getSession(false).setAttribute("user", user);
			cargarVehiculos();
			System.out.println("UsuarioMBean - login - Fin");
			return NAVIGATION_LOGIN;
		}
		
		System.out.println("UsuarioMBean - login - Fin");
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
	
	public void cargarVehiculos(){
		System.out.println(((UsuarioDTO)getSession(false).getAttribute("user")).getNombre());
		listaMonitoreo = servicioHistorica.listarMonitoreo((UsuarioDTO)getSession(true).getAttribute("user"));
	}
	
	//Obtener y Establecer
	public List<HistoricaDTO> getListaMonitoreo() {
		return listaMonitoreo;
	}

	public void setListaMonitoreo(List<HistoricaDTO> listaMonitoreo) {
		this.listaMonitoreo = listaMonitoreo;
	}
}
