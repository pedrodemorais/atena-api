package com.henritec.atena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henritec.atena.domain.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Integer>{

}
