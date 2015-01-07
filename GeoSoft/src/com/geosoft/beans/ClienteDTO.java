package com.geosoft.beans;

public class ClienteDTO {
	//tipos de Datos
	private Integer ClienteId;
	private String Nombre;
	private String Apellido;
	private Integer DNI;
	private Integer Telefono;
	private String Correo;
	private Character Estado;
	private UsuarioDTO usuario;
	
	//constructor
	public ClienteDTO(Integer clienteId, String nombre, String apellido,Integer dNI, Integer telefono, String correo, Character estado,UsuarioDTO usuario) {
		ClienteId = clienteId;
		Nombre = nombre;
		Apellido = apellido;
		DNI = dNI;
		Telefono = telefono;
		Correo = correo;
		Estado = estado;
		this.usuario = usuario;
	}
	
	//metodos para comparacion de objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Apellido == null) ? 0 : Apellido.hashCode());
		result = prime * result
				+ ((ClienteId == null) ? 0 : ClienteId.hashCode());
		result = prime * result + ((Correo == null) ? 0 : Correo.hashCode());
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		result = prime * result + ((Estado == null) ? 0 : Estado.hashCode());
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result
				+ ((Telefono == null) ? 0 : Telefono.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		ClienteDTO other = (ClienteDTO) obj;
		if (Apellido == null) {
			if (other.Apellido != null)
				return false;
		} else if (!Apellido.equals(other.Apellido))
			return false;
		if (ClienteId == null) {
			if (other.ClienteId != null)
				return false;
		} else if (!ClienteId.equals(other.ClienteId))
			return false;
		if (Correo == null) {
			if (other.Correo != null)
				return false;
		} else if (!Correo.equals(other.Correo))
			return false;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		if (Estado == null) {
			if (other.Estado != null)
				return false;
		} else if (!Estado.equals(other.Estado))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (Telefono == null) {
			if (other.Telefono != null)
				return false;
		} else if (!Telefono.equals(other.Telefono))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	
	//obtener y establecer
	public Integer getClienteId() {
		return ClienteId;
	}

	public void setClienteId(Integer clienteId) {
		ClienteId = clienteId;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public Integer getDNI() {
		return DNI;
	}

	public void setDNI(Integer dNI) {
		DNI = dNI;
	}

	public Integer getTelefono() {
		return Telefono;
	}

	public void setTelefono(Integer telefono) {
		Telefono = telefono;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public Character getEstado() {
		return Estado;
	}

	public void setEstado(Character estado) {
		Estado = estado;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}		
	
}
