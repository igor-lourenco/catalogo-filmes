package com.catalogo.filmes.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "tb_pontuacao")
public class Pontuacao {

	@EmbeddedId
	private PontuacaoPK id = new PontuacaoPK();
	private Double valor;
	
	public void setFilme(Filme filme) {
		id.setFilme(filme);
	}
	
	public void setUsuario(Usuario usuario) {
		id.setUsuario(usuario);
	}
}
