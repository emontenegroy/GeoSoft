package com.geosoft.interfaces;

import java.util.List;

import com.geosoft.beans.HistoricaDTO;
import com.geosoft.beans.UsuarioDTO;

public interface HistoricaDAO {
	//Basicos
	public int insertar(HistoricaDTO historica);
	public int actualizar(HistoricaDTO historica);
	public List<HistoricaDTO> listar(HistoricaDTO historica);
	public int eliminar(Integer historicaId);
	
	//Avanzados
	public List<HistoricaDTO> listarMonitoreo(UsuarioDTO usuario);
}
