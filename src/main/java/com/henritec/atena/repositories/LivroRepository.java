package com.henritec.atena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henritec.atena.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
