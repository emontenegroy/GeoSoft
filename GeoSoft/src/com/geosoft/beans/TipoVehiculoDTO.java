package com.geosoft.beans;

public class TipoVehiculoDTO {
	//tipos de Datos
	private Integer TipoVehiculoId;
	private String Descripcion;

	//constructor
	public TipoVehiculoDTO(Integer tipoVehiculoId, String descripcion) {
		TipoVehiculoId = tipoVehiculoId;
		Descripcion = descripcion;
	}
	
	//metodos para comparacion de objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Descripcion == null) ? 0 : Descripcion.hashCode());
		result = prime * result
				+ ((TipoVehiculoId == null) ? 0 : TipoVehiculoId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoVehiculoDTO other = (TipoVehiculoDTO) obj;
		if (Descripcion == null) {
			if (other.Descripcion != null)
				return false;
		} else if (!Descripcion.equals(other.Descripcion))
			return false;
		if (TipoVehiculoId == null) {
			if (other.TipoVehiculoId != null)
				return false;
		} else if (!TipoVehiculoId.equals(other.TipoVehiculoId))
			return false;
		return true;
	}
	
	//obtener y establecer
	public Integer getTipoVehiculoId() {
		return TipoVehiculoId;
	}
	public void setTipoVehiculoId(Integer tipoVehiculoId) {
		TipoVehiculoId = tipoVehiculoId;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
}
