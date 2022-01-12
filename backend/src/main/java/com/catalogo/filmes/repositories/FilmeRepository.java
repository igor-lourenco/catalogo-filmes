package com.catalogo.filmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogo.filmes.entities.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long>{

}
