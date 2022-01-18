package com.mypackages.tests;

import com.mypackages.repositories.jpa.ClienteRepository;

public class TestClienteBean {
	
	//TEST MOCK
	public static void main(String[] args) {
	
			ClienteRepository clienteRepository = new ClienteRepository();
			
			clienteRepository.getAll().forEach(System.out::println);	
		}
	

}
