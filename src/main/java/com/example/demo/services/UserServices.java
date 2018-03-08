package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Cliente;

public interface UserServices {

	Cliente save(Cliente cliente);

	List<Cliente> findAll();



}
