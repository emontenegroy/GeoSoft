package com.geosoft.mbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import com.geosoft.beans.UsuarioDTO;
import com.geosoft.services.UsuarioService;
import com.geosoft.utils.General;

public class MUsuarioMBean extends General{
	
	//Servicios
	private UsuarioService servicioUsuario = new UsuarioService();
	
	//Navegacion
	private final String NAVIGATION_INSERT = "mUserInsert";
	private final String NAVIGATION_LIST = "mUserList";
	private final String NAVIGATION_UPDATE = "mUserUpdate";
	
	//Variables Globales
	
	//Variables para la Busqueda
	private List<SelectItem> listaCombo;
	private Integer valorCombo;
	private String valorInput;
	
	//Variables del Mantenimiento 
	private List<UsuarioDTO> listaUsuarios;
	private UsuarioDTO usuario;
	private List<SelectItem> listaEstado;

	
	//Constructor
	public MUsuarioMBean(){
		inicializarDatos();
		cargarDatos();
	}
	//Metodos
	private void inicializarDatos() {
		
	}
	
	private void cargarDatos() {
		//Cargamos los Combos
		cargarBusqueda();
		cargarEstado();
	}
	
	private void cargarBusqueda(){
		listaCombo = new ArrayList<SelectItem>();
		listaCombo.add(new SelectItem(0, "Nombre"));
		listaCombo.add(new SelectItem(1, "Apellido"));
		listaCombo.add(new SelectItem(2, "Usuario"));
		listaCombo.add(new SelectItem(3, "Estado"));
	}
	
	private void cargarEstado(){
		listaEstado = new ArrayList<SelectItem>();
		listaEstado.add(new SelectItem('N', "Nuevo"));
		listaEstado.add(new SelectItem('A', "Activo"));
		listaEstado.add(new SelectItem('I', "Inactivo"));
	}
	
	public void busquedaBasica(){
		System.out.println("busquedaBasica - Inicio");
		UsuarioDTO usuario = new UsuarioDTO();
		if(valorCombo!=null){
			switch (valorCombo) {
				case 0:	usuario.setNombre(valorInput); break;
				case 1:	usuario.setApellidos(valorInput); break;
				case 2:	usuario.setUsuario(valorInput); break;
				default: usuario.setEstado(valorInput.charAt(0)); break;
			}
			listaUsuarios=servicioUsuario.listar(usuario);
		}
		System.out.println("busquedaBasica - Fin");
	}
	
	public String cargarInsertar(){
		System.out.println("InicializaInsertar - Inicio");
		usuario = new UsuarioDTO();
		usuario.setEstado('N');
		System.out.println("InicializaInsertar - Fin");
		return NAVIGATION_INSERT;
	}

	public String insertar(){
		System.out.println("Insertar - Inicio");
		if(servicioUsuario.insertar(usuario)>0){
			valorCombo=0;
			valorInput="";
			busquedaBasica();
			return NAVIGATION_LIST;
		};
		System.out.println("Insertar - Fin");
		return NAVIGATION_INSERT;
	}
	
	public String cargarActualizar(){
		System.out.println("InicializaActualizar - Inicio");
		System.out.println("InicializaActualizar - Fin");
		return NAVIGATION_UPDATE;
	}
	
	public String actualizar(){
		System.out.println("Actualizar - Inicio");
		if(servicioUsuario.actualizar(usuario)>0){
			valorCombo=0;
			valorInput="";
			busquedaBasica();
			return NAVIGATION_LIST;
		};
		System.out.println("Actualizar - Fin");
		return NAVIGATION_INSERT;
	}
	
	public String eliminar(){
		for(UsuarioDTO u : listaUsuarios){
			if(u.isChbEliminar()){
				servicioUsuario.eliminar(u.getUsuarioId());
			}
		}
		valorCombo=0;
		valorInput="";
		busquedaBasica();
		return NAVIGATION_LIST;
	}
	
	//Obtener y Establecer
	public List<SelectItem> getListaCombo() {
		return listaCombo;
	}
	public void setListaCombo(List<SelectItem> listaCombo) {
		this.listaCombo = listaCombo;
	}
	public Integer getValorCombo() {
		return valorCombo;
	}
	public void setValorCombo(Integer valorCombo) {
		this.valorCombo = valorCombo;
	}
	public String getValorInput() {
		return valorInput;
	}
	public void setValorInput(String valorInput) {
		this.valorInput = valorInput;
	}
	public List<UsuarioDTO> getListaUsuarios() {
		return listaUsuarios;
	}
	public void setListaUsuarios(List<UsuarioDTO> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	public UsuarioDTO getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
	public List<SelectItem> getListaEstado() {
		return listaEstado;
	}
	public void setListaEstado(List<SelectItem> listaEstado) {
		this.listaEstado = listaEstado;
	}
	
}
