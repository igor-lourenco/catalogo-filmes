package com.catalogo.filmes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.catalogo.filmes.dto.FilmeDTO;
import com.catalogo.filmes.dto.PontuacaoDTO;
import com.catalogo.filmes.entities.Filme;
import com.catalogo.filmes.entities.Pontuacao;
import com.catalogo.filmes.entities.Usuario;
import com.catalogo.filmes.repositories.FilmeRepository;
import com.catalogo.filmes.repositories.PontuacaoRepository;
import com.catalogo.filmes.repositories.UsuarioRepository;

@Service
public class PontuacaoService {

	@Autowired
	private FilmeRepository filmeRepository;	
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private PontuacaoRepository pontuacaoRepository;

	@Transactional
	public FilmeDTO save(PontuacaoDTO dto) {
		Usuario usuarioEntity = usuarioRepository.findByEmail(dto.getEmail());
		
		if(usuarioEntity == null) {
			usuarioEntity = new Usuario();
			usuarioEntity.setEmail(dto.getEmail());
			usuarioEntity = usuarioRepository.saveAndFlush(usuarioEntity);
		}
		
		Filme filmeEntity = filmeRepository.findById(dto.getFilmeId()).get();
		
		Pontuacao pontuacaoEntity = new Pontuacao();
		pontuacaoEntity.setFilme(filmeEntity);
		pontuacaoEntity.setUsuario(usuarioEntity);
		pontuacaoEntity.setValor(dto.getPontuacao());
		pontuacaoEntity = pontuacaoRepository.saveAndFlush(pontuacaoEntity);
		
		double soma = 0.0;
		for (Pontuacao p : filmeEntity.getPontuacoes()) {
			soma = soma + p.getValor();
		}
		
		double media = soma / filmeEntity.getPontuacoes().size();
		
		
		filmeEntity.setPontuacao(media);
		filmeEntity.setCount(filmeEntity.getPontuacoes().size());
		filmeEntity = filmeRepository.save(filmeEntity);
		
		return new FilmeDTO(filmeEntity);
	}
	
}
