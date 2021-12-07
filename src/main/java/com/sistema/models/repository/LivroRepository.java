package com.sistema.models.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sistema.models.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

	@Query("SELECT l FROM Livro l WHERE l.tituloLivro LIKE( CONCAT('%',:nome,'%'))")
	Page<Livro> findLivroByName(String nome, Pageable pageable);

}
