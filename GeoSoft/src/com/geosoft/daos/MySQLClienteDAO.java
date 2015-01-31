package com.geosoft.daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.geosoft.beans.ClienteDTO;
import com.geosoft.interfaces.ClienteDAO;
import com.geosoft.utils.MySQLConexion;

public class MySQLClienteDAO implements ClienteDAO{

	public List<ClienteDTO> listar(ClienteDTO cliente) {
		Connection con = null;
		CallableStatement cst = null;
		String sp;
		List<ClienteDTO> result = new ArrayList<ClienteDTO>();
		ClienteDTO u;
		
		try {
			con = MySQLConexion.getConexion();
			sp = "{call sp_Cliente_Listar(?, ?, ?, ?, ?, ?, ?)}";
			cst = con.prepareCall(sp);
			
			cst.setInt(1, cliente.getClienteId()!=null?cliente.getClienteId():0);
			cst.setString(2, cliente.getNombre()!=null?cliente.getNombre():"");
			cst.setString(3, cliente.getApellido()!=null?cliente.getApellido():"");
			cst.setInt(4, cliente.getDni()!=null?cliente.getDni():0);
			cst.setInt(5, cliente.getTelefono()!=null?cliente.getTelefono():0);
			cst.setString(6, cliente.getCorreo()!=null?cliente.getCorreo():"");
			cst.setString(7, cliente.getEstado()!=null?cliente.getEstado().toString():"");
			//cst.setString(8, cliente.getUsuario()!=null?cliente.getUsuario().toString():"");
			
			ResultSet rs = cst.executeQuery();
			
			while (rs.next()) {
				u = new ClienteDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7).charAt(0));
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
