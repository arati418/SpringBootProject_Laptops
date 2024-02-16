package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.example.demo.entity.Laptops;

import com.example.demo.serviceimpl.LaptopsServiceImpl;



@Controller
public class LaptopsController {
	@Autowired
	LaptopsServiceImpl laptopsService;

	
	//Get list of Laptops
	
	@GetMapping("/laptops")
	public String getLaptops(Model model){
		model.addAttribute("laptops",laptopsService.getLaptops());
		return "viewlaptops";
	}
	
	//Get Laptops by id
	
	@GetMapping(value="/getid/{id}")
	public Laptops getLaptopsById(@PathVariable Integer id) {
		return laptopsService.getLaptopsById(id);
	}
	
	//Get Laptops by name
	
}
	
	
