package com.example.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
@Access(AccessType.FIELD)
public class Cliente extends EntidadPadre{

	private static final long serialVersionUID = -6964561186681602977L;
	
	@Column(name="nombre_cliente", nullable=false, length=30)
	private String nombreCliente;
	@Column(name="telefono_cliente", nullable=false, length=30)
	private String telefonoCliente;
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	
	
}
