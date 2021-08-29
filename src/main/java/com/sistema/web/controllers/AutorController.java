package com.sistema.web.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.models.domain.Autor;
import com.sistema.models.service.faces.AutorService;

@RestController
@RequestMapping(value="/autor")
public class AutorController {
	
	@Autowired
	private AutorService autorService;
	
	@ResponseBody
	@GetMapping(value="/listar")
	public List<Autor> findAll(){
		return autorService.findAll(); 
	}
	

	@ResponseBody
	@DeleteMapping(value="/delete/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		autorService.deleteById(id);
	}
	
	
	@ResponseBody
	@GetMapping(value="/buscar/{id}")
	public Optional<Autor> findById(@PathVariable("id") Long id) {
		return autorService.findById(id);
		
	}
	
	
	
	
	
	
}
