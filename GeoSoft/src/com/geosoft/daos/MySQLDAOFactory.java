package com.geosoft.daos;

import com.geosoft.interfaces.ClienteDAO;
import com.geosoft.interfaces.HistoricaDAO;
import com.geosoft.interfaces.UsuarioDAO;

public class MySQLDAOFactory extends DAOFactory {
	
	

	@Override
	public UsuarioDAO getUsuarioDAO() {
		return new MySQLUsuarioDAO(); //Mantenimientos usando mysql
	}

	@Override
	public HistoricaDAO getHistoricaDAO() {
		return new MySQLHistoricaDAO(); //Mantenimientos usando mysql
	}
	
	public ClienteDAO getClienteDAO(){
		return new MySQLClienteDAO();  // Mantenimiento usando mysql para clientes
	}

}
