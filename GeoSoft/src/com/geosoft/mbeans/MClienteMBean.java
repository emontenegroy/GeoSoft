package com.geosoft.mbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import com.geosoft.beans.ClienteDTO;
import com.geosoft.services.ClienteService;
import com.geosoft.utils.General;

public class MClienteMBean extends General {
	
	//Servicios
		private ClienteService servicioCliente = new ClienteService();
		
		//Navegacion
		//Variables Globales
		
		//Variables para la Busqueda
		private List<SelectItem> listaCombos;
		private Integer valorCombos;
		private String valorInput;
		
		//Variables del Mantenimiento 
		private List<ClienteDTO> listaClientes;
		
		//Constructor
		public MClienteMBean(){
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
			listaCombos = new ArrayList<SelectItem>();
			listaCombos.add(new SelectItem(0, "Nombre"));
			listaCombos.add(new SelectItem(1, "Apellido"));
			listaCombos.add(new SelectItem(2, "Correo"));
			listaCombos.add(new SelectItem(3, "Estado"));
		}
		
		public void busquedaBasica(){
			System.out.println("busquedaBasica - Inicio");
			ClienteDTO cliente = new ClienteDTO();
			if(valorCombos!=null){
				switch (valorCombos) {
					case 0:	cliente.setNombre(valorInput); break;
					case 1:	cliente.setApellido(valorInput); break;
					case 2:	cliente.setCorreo(valorInput); break;
					default: cliente.setEstado(valorInput.charAt(0)); break;
				}
				listaClientes=servicioCliente.listar(cliente);
			}
			System.out.println("busquedaBasica - Inicio");
		}
		
		//Obtener y Establecer
		public List<SelectItem> getListaCombos() {
			return listaCombos;
		}
		public void setListaCombos(List<SelectItem> listaCombos) {
			this.listaCombos = listaCombos;
		}
		public Integer getValorCombo() {
			return valorCombos;
		}
		public void setValorCombos(Integer valorCombos) {
			this.valorCombos = valorCombos;
		}
		public String getValorInput() {
			return valorInput;
		}
		public void setValorInput(String valorInput) {
			this.valorInput = valorInput;
		}
		public List<ClienteDTO> getListaClientes() {
			return listaClientes;
		}
		public void setListaClientes(List<ClienteDTO> listaClientes) {
			this.listaClientes = listaClientes;
		}

}
