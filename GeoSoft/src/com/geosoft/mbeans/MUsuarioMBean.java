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
	//Variables Globales
	
	//Variables para la Busqueda
	private List<SelectItem> listaCombo;
	private Integer valorCombo;
	private String valorInput;
	
	//Variables del Mantenimiento 
	private List<UsuarioDTO> listaUsuarios;
	
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
	}
	
	private void cargarBusqueda(){
		listaCombo = new ArrayList<SelectItem>();
		listaCombo.add(new SelectItem(0, "Nombre"));
		listaCombo.add(new SelectItem(1, "Apellido"));
		listaCombo.add(new SelectItem(2, "Usuario"));
		listaCombo.add(new SelectItem(3, "Estado"));
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
		System.out.println("busquedaBasica - Inicio");
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
	
	
}
