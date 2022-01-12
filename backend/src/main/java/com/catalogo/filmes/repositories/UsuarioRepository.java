package com.catalogo.filmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogo.filmes.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
