package com.geosoft.services;

import java.util.List;

import com.geosoft.beans.UsuarioDTO;
import com.geosoft.daos.DAOFactory;
import com.geosoft.interfaces.UsuarioDAO;

public class UsuarioService {
	DAOFactory fabrica = DAOFactory.getDAOFactory(1);
	UsuarioDAO objUsuarioDAO = fabrica.getUsuarioDAO();

	public int insertar(UsuarioDTO usuario){
		return objUsuarioDAO.insertar(usuario);
	}
	
	public int actualizar(UsuarioDTO usuario){
		return objUsuarioDAO.actualizar(usuario);
	}
	
	public List<UsuarioDTO> listar(UsuarioDTO usuario){
		return objUsuarioDAO.listar(usuario);
	}
	
	public int eliminar(Integer usuarioId){
		return objUsuarioDAO.eliminar(usuarioId);
	}
	
}
