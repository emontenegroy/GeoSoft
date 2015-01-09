package com.geosoft.beans;

public class HistoricaDTO {
	//variables
	private Integer historicaId;
	private String latitud;
	private String longitud;
	private String velocidad;
	private String radio;
	private String fecha;
	private VehiculoDTO vehiculo;
	
	//constructor
	public HistoricaDTO() {
	}
	
	public HistoricaDTO(Integer historicaId, String latitud, String longitud,
			String velocidad, String radio, String fecha, VehiculoDTO vehiculo) {
		this.historicaId = historicaId;
		this.latitud = latitud;
		this.longitud = longitud;
		this.velocidad = velocidad;
		this.radio = radio;
		this.fecha = fecha;
		this.vehiculo = vehiculo;
	}



	//metodos para comparacion de objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((historicaId == null) ? 0 : historicaId.hashCode());
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
		HistoricaDTO other = (HistoricaDTO) obj;
		if (historicaId == null) {
			if (other.historicaId != null)
				return false;
		} else if (!historicaId.equals(other.historicaId))
			return false;
		return true;
	}

	//obtener y establecer
	public Integer getHistoricaId() {
		return historicaId;
	}

	public void setHistoricaId(Integer historicaId) {
		this.historicaId = historicaId;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public VehiculoDTO getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(VehiculoDTO vehiculo) {
		this.vehiculo = vehiculo;
	}
	
}
