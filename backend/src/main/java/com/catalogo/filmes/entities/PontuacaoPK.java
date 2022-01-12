package com.catalogo.filmes.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Embeddable
public class PontuacaoPK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "filme_id")
	private Filme filme;
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
}
