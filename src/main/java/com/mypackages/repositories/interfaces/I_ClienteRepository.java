package com.mypackages.repositories.interfaces;

import java.util.List;
import java.util.stream.Stream;

import com.mypackages.entities.Cliente;

public interface I_ClienteRepository {
	
	//MÉTODOS CRUD JPA
	public void save(Cliente cliente);
	
	public void remove(Cliente cliente);
	
	public void update(Cliente cliente);
	
	List<Cliente> getAll();
	
	public Cliente getById(int id);

}
