package com.mypackages.repositories.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.mypackages.entities.Cliente;
import com.mypackages.repositories.interfaces.I_ClienteRepository;
import com.mypackages.utils.JpaUtil;

public class ClienteRepository implements I_ClienteRepository{

	EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();

	
	
	@Override
	public void save(Cliente cliente) {
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();	
		JpaUtil.shutdown();
	}

	@Override
	public void remove(Cliente cliente) {
		entityManager.getTransaction().begin();
		entityManager.remove(cliente);
		entityManager.getTransaction().commit();
		JpaUtil.shutdown();
		
		
	}

	@Override
	public void update(Cliente cliente) {
		entityManager.getTransaction().begin();
		entityManager.merge(cliente);
		entityManager.getTransaction().commit();	
		JpaUtil.shutdown();
		
	}

	@Override
	public List<Cliente> getAll() {
		

		entityManager.getTransaction().begin();
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		listaClientes = (List<Cliente>)entityManager.createNamedQuery("Cliente.findAll").getResultList();
	 
		entityManager.getTransaction().commit();
		
		JpaUtil.shutdown();
		
		
		
		return listaClientes;
	}

	@Override
	public Cliente getById(int id) {
		
		entityManager.getTransaction().begin();
		
		Cliente cliente = new Cliente();
		
		cliente = entityManager.find(Cliente.class , id);
		
		entityManager.getTransaction().commit();
		
		JpaUtil.shutdown();
		
		
		return cliente;
	}

}
