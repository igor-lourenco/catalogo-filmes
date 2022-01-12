package com.catalogo.filmes.dto;

import com.catalogo.filmes.entities.Usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {

	private Long id;
	private String email;
	
	public UsuarioDTO(Usuario obj) {
		this.id = obj.getId();
		this.email = obj.getEmail();
	}
}
