package com.geosoft.interfaces;

import java.util.List;

import com.geosoft.beans.UsuarioDTO;

public interface VehiculoDAO {
	//Basicos
	public int insertar(UsuarioDTO usuario);
	public int actualizar(UsuarioDTO usuario);
	public List<UsuarioDTO> listar(UsuarioDTO usuario);
	public int eliminar(Integer usuarioId);
	
	//Avanzados
	

}
