package com.mypackages.repositories.interfaces;

import java.util.List;
import java.util.stream.Stream;

import com.mypackages.entities.Cliente;

public interface I_ClienteRepository {
	
	//Crud
	void save(Cliente cliente);
	
	void remove(Cliente cliente);
	
	void update(Cliente cliente);
	
	
	
	
	// Listas
	List<Cliente> getAll();
	
	
	
	
	//Metodos defaults
	default Stream<Cliente> getStream(){
		
		return getAll().stream();
	}
	
	default Cliente getById(int id){
		
		return getStream()
			.filter(objetoCliente -> objetoCliente.getId() == id)
			.findAny()
			.orElse(new Cliente());
	}

}
