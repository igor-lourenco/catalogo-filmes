package com.catalogo.filmes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.catalogo.filmes.dto.FilmeDTO;
import com.catalogo.filmes.entities.Filme;
import com.catalogo.filmes.repositories.FilmeRepository;

@Service
public class FilmeService {

	@Autowired
	private FilmeRepository repository;

	@Transactional(readOnly = true)
	public Page<FilmeDTO> findAll(Pageable pageable){
		Page<Filme> entity = repository.findAll(pageable);
		return entity.map(f -> new FilmeDTO(f));
	}
	
	@Transactional(readOnly = true)
	public FilmeDTO findById(Long id) {
		Filme entity = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("id não encontado"));
		return new FilmeDTO(entity);
	}
}
