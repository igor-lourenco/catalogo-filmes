package com.catalogo.filmes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalogo.filmes.dto.FilmeDTO;
import com.catalogo.filmes.dto.PontuacaoDTO;
import com.catalogo.filmes.services.PontuacaoService;

@RestController
@RequestMapping(value = "/pontuacoes")
public class PontuacaoController {

	@Autowired
	private PontuacaoService service;
	
	@PutMapping
	public ResponseEntity<FilmeDTO> savePontuacao(@RequestBody PontuacaoDTO dto){
		var obj = service.save(dto);
		return ResponseEntity.ok(obj);
	}
}
