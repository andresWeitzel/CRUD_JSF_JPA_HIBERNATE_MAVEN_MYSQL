package com.mypackages.repositories.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import com.mypackages.entities.Cliente;
import com.mypackages.repositories.interfaces.I_ClienteRepository;
import com.mypackages.utils.JpaUtil;

public class ClienteRepository implements I_ClienteRepository{

	EntityManager entity = JpaUtil.getEntityManagerFactory().createEntityManager();

	
	
	@Override
	public void save(Cliente cliente) {
		entity.getTransaction().begin();
		entity.persist(cliente);
		entity.getTransaction().commit();	
		JpaUtil.shutdown();
	}

	@Override
	public void remove(Cliente cliente) {
	
		
	}

	@Override
	public void update(Cliente cliente) {
		entity.getTransaction().begin();
		entity.merge(cliente);
		entity.getTransaction().commit();	
		JpaUtil.shutdown();
		
	}

	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
