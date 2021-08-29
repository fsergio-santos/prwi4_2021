package com.sistema.models.service.faces;

import java.util.List;
import java.util.Optional;

import com.sistema.models.domain.Autor;

public interface AutorService {
	
	List<Autor> findAll();
	void save(Autor autor);
	void update(Autor autor);
	void deleteById(Long id);
	Optional<Autor> findById(Long id);

}
