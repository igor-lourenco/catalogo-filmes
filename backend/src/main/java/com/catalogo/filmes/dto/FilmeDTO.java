package com.catalogo.filmes.dto;

import com.catalogo.filmes.entities.Filme;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FilmeDTO {

	private Long id;
	private String titulo;
	private Double pontuacao;
	private Integer count;
	private String imagem;
	
	public FilmeDTO(Filme obj) {
		id = obj.getId();
		titulo = obj.getTitulo();
		pontuacao = obj.getPontuacao();
		count = obj.getCount();
		imagem = obj.getImagem();
	}
}
