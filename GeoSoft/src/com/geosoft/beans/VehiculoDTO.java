package com.geosoft.beans;

public class VehiculoDTO {
	//tipos de Datos
	private Integer VehiculoId;
	private String Placa;
	private String NroMotor;
	private String Marca;
	private String Anio;
	private String Modelo;
	private Character Estado;
	private ClienteDTO ClienteId;
	private TipoVehiculoDTO TipoVehiculoId;

	//constructor
	public VehiculoDTO(Integer vehiculoId, String placa, String nroMotor,String marca, String anio, String modelo, Character estado,ClienteDTO clienteId, TipoVehiculoDTO tipoVehiculoId) {
		VehiculoId = vehiculoId;
		Placa = placa;
		NroMotor = nroMotor;
		Marca = marca;
		Anio = anio;
		Modelo = modelo;
		Estado = estado;
		ClienteId = clienteId;
		TipoVehiculoId = tipoVehiculoId;
	}
	
	//metodos para comparacion de objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Anio == null) ? 0 : Anio.hashCode());
		result = prime * result
				+ ((ClienteId == null) ? 0 : ClienteId.hashCode());
		result = prime * result + ((Estado == null) ? 0 : Estado.hashCode());
		result = prime * result + ((Marca == null) ? 0 : Marca.hashCode());
		result = prime * result + ((Modelo == null) ? 0 : Modelo.hashCode());
		result = prime * result
				+ ((NroMotor == null) ? 0 : NroMotor.hashCode());
		result = prime * result + ((Placa == null) ? 0 : Placa.hashCode());
		result = prime * result
				+ ((TipoVehiculoId == null) ? 0 : TipoVehiculoId.hashCode());
		result = prime * result
				+ ((VehiculoId == null) ? 0 : VehiculoId.hashCode());
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
		if (Anio == null) {
			if (other.Anio != null)
				return false;
		} else if (!Anio.equals(other.Anio))
			return false;
		if (ClienteId == null) {
			if (other.ClienteId != null)
				return false;
		} else if (!ClienteId.equals(other.ClienteId))
			return false;
		if (Estado == null) {
			if (other.Estado != null)
				return false;
		} else if (!Estado.equals(other.Estado))
			return false;
		if (Marca == null) {
			if (other.Marca != null)
				return false;
		} else if (!Marca.equals(other.Marca))
			return false;
		if (Modelo == null) {
			if (other.Modelo != null)
				return false;
		} else if (!Modelo.equals(other.Modelo))
			return false;
		if (NroMotor == null) {
			if (other.NroMotor != null)
				return false;
		} else if (!NroMotor.equals(other.NroMotor))
			return false;
		if (Placa == null) {
			if (other.Placa != null)
				return false;
		} else if (!Placa.equals(other.Placa))
			return false;
		if (TipoVehiculoId == null) {
			if (other.TipoVehiculoId != null)
				return false;
		} else if (!TipoVehiculoId.equals(other.TipoVehiculoId))
			return false;
		if (VehiculoId == null) {
			if (other.VehiculoId != null)
				return false;
		} else if (!VehiculoId.equals(other.VehiculoId))
			return false;
		return true;
	}
	
	//obtener y establecer
	public Integer getVehiculoId() {
		return VehiculoId;
	}

	public void setVehiculoId(Integer vehiculoId) {
		VehiculoId = vehiculoId;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getNroMotor() {
		return NroMotor;
	}

	public void setNroMotor(String nroMotor) {
		NroMotor = nroMotor;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getAnio() {
		return Anio;
	}

	public void setAnio(String anio) {
		Anio = anio;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public Character getEstado() {
		return Estado;
	}

	public void setEstado(Character estado) {
		Estado = estado;
	}

	public ClienteDTO getClienteId() {
		return ClienteId;
	}

	public void setClienteId(ClienteDTO clienteId) {
		ClienteId = clienteId;
	}

	public TipoVehiculoDTO getTipoVehiculoId() {
		return TipoVehiculoId;
	}

	public void setTipoVehiculoId(TipoVehiculoDTO tipoVehiculoId) {
		TipoVehiculoId = tipoVehiculoId;
	}
	
}
