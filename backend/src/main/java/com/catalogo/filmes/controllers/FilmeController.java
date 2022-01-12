package com.catalogo.filmes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalogo.filmes.dto.FilmeDTO;
import com.catalogo.filmes.services.FilmeService;

@RestController
@RequestMapping(value = "/filmes")
public class FilmeController {

	@Autowired
	private FilmeService service;
	
	@GetMapping
	public ResponseEntity<Page<FilmeDTO>> findAll(Pageable pageable){
		var obj = service.findAll(pageable);
		return ResponseEntity.ok(obj);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<FilmeDTO> findAll(@PathVariable Long id){
		var obj = service.findById(id);
		return ResponseEntity.ok(obj);
	}
}
