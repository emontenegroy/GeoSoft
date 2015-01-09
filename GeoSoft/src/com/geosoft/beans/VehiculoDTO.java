package com.geosoft.beans;

public class VehiculoDTO {
	//tipos de Datos
	private Integer vehiculoId;
	private String placa;
	private String nroMotor;
	private String marca;
	private String anio;
	private String modelo;
	private Character estado;
	private ClienteDTO cliente;
	private TipoVehiculoDTO tipoVehiculo;

	//constructor
	public VehiculoDTO() {
	}
	
	public VehiculoDTO(Integer vehiculoId, String placa, String nroMotor,
			String marca, String anio, String modelo, Character estado,
			ClienteDTO clienteId, TipoVehiculoDTO tipoVehiculoId) {
		this.vehiculoId = vehiculoId;
		this.placa = placa;
		this.nroMotor = nroMotor;
		this.marca = marca;
		this.anio = anio;
		this.modelo = modelo;
		this.estado = estado;
		this.cliente = clienteId;
		this.tipoVehiculo = tipoVehiculoId;
	}

	//metodos para comparacion de objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((vehiculoId == null) ? 0 : vehiculoId.hashCode());
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
		VehiculoDTO other = (VehiculoDTO) obj;
		if (vehiculoId == null) {
			if (other.vehiculoId != null)
				return false;
		} else if (!vehiculoId.equals(other.vehiculoId))
			return false;
		return true;
	}
	
	//obtener y establecer
	public Integer getVehiculoId() {
		return vehiculoId;
	}

	public void setVehiculoId(Integer vehiculoId) {
		this.vehiculoId = vehiculoId;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNroMotor() {
		return nroMotor;
	}

	public void setNroMotor(String nroMotor) {
		this.nroMotor = nroMotor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public TipoVehiculoDTO getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculoDTO tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
}
