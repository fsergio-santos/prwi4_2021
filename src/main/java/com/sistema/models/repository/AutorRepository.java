package com.sistema.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sistema.models.domain.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{

}
