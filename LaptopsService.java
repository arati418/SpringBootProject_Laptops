package com.example.demo.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Laptops;




@Service
public interface LaptopsService {
	
	public List<Laptops> getLaptops();
	

}
