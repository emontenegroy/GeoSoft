package com.geosoft.services;

import java.util.List;

import com.geosoft.beans.HistoricaDTO;
import com.geosoft.beans.UsuarioDTO;
import com.geosoft.daos.DAOFactory;
import com.geosoft.interfaces.HistoricaDAO;

public class HistoricaService {
	DAOFactory fabrica = DAOFactory.getDAOFactory(1);
	HistoricaDAO objHistoricaDAO = fabrica.getHistoricaDAO();
	
	//Basicos
	public int insertar(HistoricaDTO historica){
		return objHistoricaDAO.insertar(historica);
	}
	public int actualizar(HistoricaDTO historica){
		return objHistoricaDAO.actualizar(historica);
	}
	public List<HistoricaDTO> listar(HistoricaDTO historica){
		return objHistoricaDAO.listar(historica);
	}
	public int eliminar(Integer historicaId){
		return objHistoricaDAO.eliminar(historicaId);
	}
	
	//Avanzados
	public List<HistoricaDTO> listarMonitoreo(UsuarioDTO usuario){
		return objHistoricaDAO.listarMonitoreo(usuario);
	}

}
