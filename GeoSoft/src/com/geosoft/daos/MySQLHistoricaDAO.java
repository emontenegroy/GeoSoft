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
import com.geosoft.interfaces.HistoricaDAO;
import com.geosoft.utils.MySQLConexion;

public class MySQLHistoricaDAO implements HistoricaDAO{
	//Basico
	public int insertar(HistoricaDTO historica) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int actualizar(HistoricaDTO historica) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<HistoricaDTO> listar(HistoricaDTO historica) {
		// TODO Auto-generated method stub
		return null;
	}

	public int eliminar(Integer historicaId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//Avanzado
	public List<HistoricaDTO> listarMonitoreo(UsuarioDTO usuario) {
		Connection con = null;
		CallableStatement cst = null;
		String sp;
		List<HistoricaDTO> result = new ArrayList<HistoricaDTO>();
		HistoricaDTO h;
		VehiculoDTO vTemp;
		TipoVehiculoDTO tvTemp;
		
		try {
			con = MySQLConexion.getConexion();
			sp = "{call sp_Vehiculo_ListarMonitoreo(?)}";
			cst = con.prepareCall(sp);
			
			cst.setInt(1, usuario.getUsuarioId());
			
			ResultSet rs = cst.executeQuery();
			
			while (rs.next()) {
				tvTemp = new TipoVehiculoDTO(null, rs.getString(8));
				vTemp = new VehiculoDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7).charAt(0), new ClienteDTO(), tvTemp);
				h = new HistoricaDTO(null, rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), vTemp);
				result.add(h);
			}
			
		} catch (Exception e) {
			System.out.println("MySQLHistoricaDAO - listarMonitoreo -> Error en la Conexión: "+e.getMessage());
		} finally {
			try {
				if(con != null) con.close();
				if(cst != null) cst.close();
			} catch (SQLException e) {
				System.out.println("MySQLHistoricaDAO - listarMonitoreo -> No se pudo Cerrar la Conexion: "+e.getMessage());
			} 
		}
		return result;
	}

}
