package com.catalogo.filmes.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PontuacaoDTO {

	private Long filmeId;
	private String email;
	private Double pontuacao;
}
