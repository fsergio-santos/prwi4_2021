package com.sistema.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema.models.domain.Autor;
import com.sistema.models.repository.AutorRepository;
import com.sistema.models.service.faces.AutorService;

@Service
@Transactional
public class AutorServiceImpl implements AutorService {
    
	@Autowired
	private AutorRepository autorRepository;
		
	@Override
	public void save(Autor autor) {      
		autorRepository.save(autor);
	}

	@Override
	public void update(Autor autor) {    
		save(autor);
	}

	@Override
	public void deleteById(Long id) {    
		autorRepository.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Autor> findById(Long id) {
		return autorRepository.findById(id);
	}

	@Override
	public List<Autor> findAll() {
		return autorRepository.findAll();
	}

}
