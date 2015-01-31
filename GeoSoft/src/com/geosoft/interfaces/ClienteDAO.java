package com.geosoft.interfaces;

import java.util.List;

import com.geosoft.beans.ClienteDTO;

public interface ClienteDAO {
	
	public List<ClienteDTO> listar(ClienteDTO cliente);
/*	public int insertar(ClienteDTO cliente);
	public int actualizar(ClienteDTO cliente);
	public int eliminar(Integer clienteid);*/

}
