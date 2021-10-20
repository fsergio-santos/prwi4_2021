package com.sistema.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.models.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
