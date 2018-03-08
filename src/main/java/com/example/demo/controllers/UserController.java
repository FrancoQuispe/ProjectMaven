package com.example.demo.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.services.UserServices;
import com.example.demo.util.QueryResult;
import com.example.demo.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UserController {
	
	@Autowired
	protected UserServices userServices;
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson) throws JsonParseException, JsonMappingException, IOException {
	
	this.mapper = new ObjectMapper();

	Cliente cliente = this.mapper.readValue(userJson, Cliente.class);
	
	if(!this.validate(cliente))
	{
		return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),"Faltan campos obligatorios");
	}
	
	this.userServices.save(cliente);
	 	
	return new RestResponse(HttpStatus.OK.value(), "Operación exitosa");

	}
	
	@RequestMapping(value = "/getClientes", method = RequestMethod.GET)
	public List<Cliente> getClientes() {
		
		return this.userServices.findAll();
	}
	
	private boolean validate(Cliente cliente) {
		
		boolean isValid = true;
		
		
		if(cliente.getNombreCliente() == null || cliente.getNombreCliente() == "")
		{
			isValid = false;
		}
		
		if(cliente.getNombreCliente() == null || cliente.getNombreCliente() == "")
		{
			isValid = false;
		}
		
		return isValid;
	}
}
