package com.mypackages.controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.mypackages.models.Cliente;
import com.mypackages.repositories.jpa.ClienteRepository;

@ManagedBean(name="ClienteBean")
@RequestScoped
public class ClienteBean {
	
	
	public List<Cliente> getAll(){
		
		ClienteRepository listaClientes = new ClienteRepository();
		
		return listaClientes.getAll();
		
		
	}
	//TEST MOCK BORRAR
	public static void main(String[] args) {
		ClienteRepository listaClientes = new ClienteRepository();
		
		listaClientes.getAll().forEach(System.out::println);	
	}
	

}
