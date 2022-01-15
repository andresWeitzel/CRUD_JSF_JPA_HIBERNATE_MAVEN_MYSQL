package com.mypackages.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes") //Mismo nombre de tabla de la db
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Autoincrement
	private int id;

	@Column
	private String nombre;
	
	
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + "]";
	}
}
