package com.geosoft.daos;

import com.geosoft.interfaces.HistoricaDAO;
import com.geosoft.interfaces.UsuarioDAO;
import com.geosoft.interfaces.ClienteDAO;

public abstract class DAOFactory {

	//Bases de Datos a Manejar
	private static final int MYSQL = 1;
	private static final int SQL = 2;

	//Ayuda a Seleccionar la Base de Datos con la que se va a Trabajar
	public static DAOFactory getDAOFactory(int qFactory) {
		switch (qFactory) {
		case MYSQL:
			return new MySQLDAOFactory();
		case SQL: // SQL
			return new SQLDAOFactory();
		default:
			return null;
		}
	}

	//Declaramos cada una de los Metodos DAO
	public abstract UsuarioDAO getUsuarioDAO();
	public abstract HistoricaDAO getHistoricaDAO();
	public abstract ClienteDAO getClienteDAO();

}

