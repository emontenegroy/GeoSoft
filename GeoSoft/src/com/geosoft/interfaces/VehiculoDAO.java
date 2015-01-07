package com.geosoft.interfaces;

import java.util.List;

import com.geosoft.beans.UsuarioDTO;
import com.geosoft.beans.VehiculoDTO;

public interface VehiculoDAO {
	//Basicos
	public int insertar(VehiculoDTO usuario);
	public int actualizar(VehiculoDTO usuario);
	public List<VehiculoDTO> listar(VehiculoDTO usuario);
	public int eliminar(Integer usuarioId);
	
	//Avanzados
	public List<VehiculoDTO> listarMonitoreo(UsuarioDTO usuario);

}
