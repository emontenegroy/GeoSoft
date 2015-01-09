package com.geosoft.interfaces;

import java.util.List;

import com.geosoft.beans.VehiculoDTO;

public interface VehiculoDAO {
	//Basicos
	public int insertar(VehiculoDTO vehiculo);
	public int actualizar(VehiculoDTO vehiculo);
	public List<VehiculoDTO> listar(VehiculoDTO vehiculo);
	public int eliminar(Integer vehiculoId);

}
