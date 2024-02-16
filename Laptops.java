package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptops {
	@Id
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laptops(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Laptops() {
		super();
	}
	@Override
	public String toString() {
		return "Laptops [id=" + id + ", name=" + name + "]";
	}
	
	

}
