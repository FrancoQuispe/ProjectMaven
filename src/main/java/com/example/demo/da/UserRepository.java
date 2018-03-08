package com.example.demo.da;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Cliente;

public interface UserRepository extends JpaRepository<Cliente, Long>{
	
	@SuppressWarnings("unchecked")
	Cliente save(Cliente cliente);
}
