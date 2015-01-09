package com.geosoft.daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.geosoft.beans.ClienteDTO;
import com.geosoft.beans.HistoricaDTO;
import com.geosoft.beans.TipoVehiculoDTO;
import com.geosoft.beans.UsuarioDTO;
import com.geosoft.beans.VehiculoDTO;
import com.geosoft.interfaces.VehiculoDAO;
import com.geosoft.utils.MySQLConexion;

public class MySQLVehiculoDAO implements VehiculoDAO{
	//Basicos
	public int insertar(VehiculoDTO usuario) {
 
		return 0;
	}

	public int actualizar(VehiculoDTO usuario) {

		return 0;
	}

	public List<VehiculoDTO> listar(VehiculoDTO usuario) {

		return null;
	}

	public int eliminar(Integer usuarioId) {

		return 0;
	}
	
}
