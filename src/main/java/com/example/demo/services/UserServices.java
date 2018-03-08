package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Cliente;

public interface UserServices {

	/**
	 * Guarda usuario
	 * @param cliente
	 * @return el usuario guardado
	 */
	Cliente save(Cliente cliente);
	
	/**
	 * Muesta la lista de clientes
	 * @return lista clientes
	 */
	List<Cliente> findAll();
	
	/**
	 * Eliminar cliente con el ID recibido
	 * @param id
	 */
	void eliminarCliente(Long id);


}
