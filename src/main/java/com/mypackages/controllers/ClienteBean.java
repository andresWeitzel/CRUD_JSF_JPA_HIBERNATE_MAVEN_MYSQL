package com.mypackages.controllers;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.mypackages.models.Cliente;
import com.mypackages.repositories.jpa.ClienteRepository;

@SuppressWarnings("deprecation")
@ManagedBean(name="ClienteBean")
@RequestScoped
public class ClienteBean {
	
	
	public List<Cliente> getAll(){
		
		
		ClienteRepository clienteRepository = new ClienteRepository();
		

		 return clienteRepository.getAll();
		

		
	}

	

}
