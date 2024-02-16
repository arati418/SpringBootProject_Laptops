package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Laptops;

import com.example.demo.repository.LaptopsRepository;
import com.example.demo.service.LaptopsService;

@Service
public  class LaptopsServiceImpl implements LaptopsService {
	
	@Autowired
	LaptopsRepository laptopsRepository;
	
	public List<Laptops> getLaptops(){
		return laptopsRepository.findAll();
	}

	public Laptops getLaptopsById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Laptops> laptops = laptopsRepository.findById(id);
		return laptops.orElse(null);
	}

}
