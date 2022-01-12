package com.catalogo.filmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogo.filmes.entities.Pontuacao;
import com.catalogo.filmes.entities.PontuacaoPK;

public interface PontuacaoRepository extends JpaRepository<Pontuacao, PontuacaoPK>{

}
