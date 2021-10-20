package com.sistema.web.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.models.domain.Livro;
import com.sistema.models.service.faces.LivroService;

@RestController
@RequestMapping(value="/livro")
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@ResponseBody
	@GetMapping(value="/listar")
	public List<Livro> findAll(){
		return livroService.findAll();
	}
	
	
	@ResponseBody
	@PostMapping(value="/inserir", consumes = MediaType.APPLICATION_JSON_VALUE,
							       produces = MediaType.APPLICATION_JSON_VALUE)
	public Livro inserir(@RequestBody Livro livro) {
		return livroService.save(livro);
	}
	
	@ResponseBody
	@GetMapping(value="/buscar/{id}")
	public Optional<Livro> buscar(@PathVariable("id") Long id) {
		return livroService.findById(id);
	}
	
	@ResponseBody
	@PostMapping(value="/alteracao")
	public Livro update(@RequestBody Livro livro) {
		return livroService.update(livro);
	}
	
	@ResponseBody
	@DeleteMapping(value="/delete/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		livroService.deleteById(id);
	}

}

//http://localhost:8080/livro/listar
//http://localhost:8080/livro/inserir
//http://localhost:8080/livro/alteração
//http://localhost:8080/livro/excluir/id
//http://localhost:8080/livro/buscar/id
	
	