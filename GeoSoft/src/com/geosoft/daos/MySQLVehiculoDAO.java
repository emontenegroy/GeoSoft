package com.geosoft.daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.geosoft.beans.UsuarioDTO;
import com.geosoft.beans.VehiculoDTO;
import com.geosoft.interfaces.VehiculoDAO;
import com.geosoft.utils.MySQLConexion;

public class MySQLVehiculoDAO implements VehiculoDAO{

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

	public List<VehiculoDTO> listarMonitoreo(UsuarioDTO usuario) {
		Connection con = null;
		CallableStatement cst = null;
		String sp;
		List<VehiculoDTO> result = new ArrayList<VehiculoDTO>();
		UsuarioDTO u;
		
		try {
			con = MySQLConexion.getConexion();
			sp = "{call sp_Vehiculo_ListarMonitoreo(?)}";
			cst = con.prepareCall(sp);

			cst.setInt(1, usuario.getUsuarioId());
			
			ResultSet rs = cst.executeQuery();
			
			while (rs.next()) {
				u = new UsuarioDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6).charAt(0));
				result.add(u);
			}
			
		} catch (Exception e) {
			System.out.println("MySQLUsuarioDAO - listar -> Error en la Conexión: "+e.getMessage());
		} finally {
			try {
				if(con != null) con.close();
				if(cst != null) cst.close();
			} catch (SQLException e) {
				System.out.println("MySQLUsuarioDAO - listar -> No se pudo Cerrar la Conexion: "+e.getMessage());
			} 
		}
		
		// TODO Auto-generated method stub
		return result;
	}

}
