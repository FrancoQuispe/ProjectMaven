package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Access(AccessType.FIELD)
public class EntidadPadre implements Serializable{

	private static final long serialVersionUID = 6860163967900789405L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", unique=true, nullable = false)
	
	private Long id;

	public Long getID() {
		return id;
	}

	public void setID(Long iD) {
		id = iD;
	}
}
