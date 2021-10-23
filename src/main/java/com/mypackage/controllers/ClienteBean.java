package com.mypackage.controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.mypackages.models.Cliente;
import com.mypackages.repositories.jpa.ClienteRepository;

@ManagedBean
@RequestScoped
public class ClienteBean {
	
	
	public List<Cliente> getAll(){
		
		ClienteRepository listaClientes = new ClienteRepository();
		
		return listaClientes.getAll();
	}

}
