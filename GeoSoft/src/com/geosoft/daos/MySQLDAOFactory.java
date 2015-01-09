package com.geosoft.daos;

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

}
