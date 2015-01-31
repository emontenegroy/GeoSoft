package com.geosoft.beans;

public class ClienteDTO {
	//variables
	private Integer clienteId;
	private String nombre;
	private String apellido;
	private Integer dni;
	private Integer telefono;
	private String correo;
	private Character estado;
	private UsuarioDTO usuario;
	
	//constructor
	public ClienteDTO() {
		
	}
	
	public ClienteDTO(Integer clienteId, String nombre, String apellido,
			Integer dni, Integer telefono, String correo, Character estado) {
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.correo = correo;
		this.estado = estado;
	}
	
/*	public ClienteDTO(Integer clienteId, String nombre, String apellido,
			Integer dni, Integer telefono, String correo, Character estado,
			UsuarioDTO usuario) {
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.correo = correo;
		this.estado = estado;
		this.usuario = usuario;
	}*/
	
	//metodos para comparacion de objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((clienteId == null) ? 0 : clienteId.hashCode());
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
		if (clienteId == null) {
			if (other.clienteId != null)
				return false;
		} else if (!clienteId.equals(other.clienteId))
			return false;
		return true;
	}
	
	//obtener y establecer
	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}		
	
}
