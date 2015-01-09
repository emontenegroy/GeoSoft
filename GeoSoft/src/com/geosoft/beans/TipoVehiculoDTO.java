package com.geosoft.beans;

public class TipoVehiculoDTO {
	//tipos de Datos
	private Integer tipoVehiculoId;
	private String descripcion;

	//constructor
	public TipoVehiculoDTO() {
	}
	
	public TipoVehiculoDTO(Integer tipoVehiculoId, String descripcion) {
		this.tipoVehiculoId = tipoVehiculoId;
		this.descripcion = descripcion;
	}
	
	//metodos para comparacion de objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((tipoVehiculoId == null) ? 0 : tipoVehiculoId.hashCode());
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
		if (tipoVehiculoId == null) {
			if (other.tipoVehiculoId != null)
				return false;
		} else if (!tipoVehiculoId.equals(other.tipoVehiculoId))
			return false;
		return true;
	}
	
	//obtener y establecer
	public Integer getTipoVehiculoId() {
		return tipoVehiculoId;
	}

	public void setTipoVehiculoId(Integer tipoVehiculoId) {
		this.tipoVehiculoId = tipoVehiculoId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
