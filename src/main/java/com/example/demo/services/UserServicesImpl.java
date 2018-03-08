package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.da.UserRepository;
import com.example.demo.model.Cliente;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	protected UserRepository userRepository;

	@Override
	public Cliente save(Cliente cliente) {
		return this.userRepository.save(cliente);
	}

	@Override
	public List<Cliente> findAll() {

		return this.userRepository.findAll();
	}

	@Override
	public void eliminarCliente(Long id) {
		
		this.userRepository.deleteById(id);
	}
}
