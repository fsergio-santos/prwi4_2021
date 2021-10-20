package com.sistema.models.service.faces;

import java.util.List;
import java.util.Optional;

import com.sistema.models.domain.Livro;

public interface LivroService {

	Livro save(Livro livro);
	Livro update(Livro livro);
	void deleteById(Long id);
	Optional<Livro> findById(Long id);
	List<Livro> findAll();
}
