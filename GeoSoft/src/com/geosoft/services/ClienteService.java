package com.geosoft.services;

import java.util.List;

import com.geosoft.beans.ClienteDTO;
import com.geosoft.beans.UsuarioDTO;
import com.geosoft.daos.DAOFactory;
import com.geosoft.interfaces.ClienteDAO;
import com.geosoft.interfaces.UsuarioDAO;

public class ClienteService {
	
	DAOFactory fabrica = DAOFactory.getDAOFactory(1);
	ClienteDAO objClienteDAO = fabrica.getClienteDAO();
	
	public List<ClienteDTO> listar(ClienteDTO cliente){
		return objClienteDAO.listar(cliente);
	}

}
