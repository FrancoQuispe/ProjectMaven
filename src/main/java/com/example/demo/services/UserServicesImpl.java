package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.da.UserRepository;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	protected UserRepository userRepository;
}
