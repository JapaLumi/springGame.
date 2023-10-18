package com.senai.lumi.PrjGame.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.senai.lumi.PrjGame.entities.Jogo;
import com.senai.lumi.PrjGame.repositories.JogoRepository;

@Service
public class JogoServices {

	private final JogoRepository jogoRepository;
	
	public JogoServices(JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}
	//inserir produto
    public Jogo savejogo(Jogo jogo) {
	    return jogoRepository.save(jogo);
		}

	// listar produto por id
	public Jogo getJogoById(Long id) {
		return jogoRepository.findById(id).orElse(null);
	}

	// listar todos os produtos
	public List<Jogo> getAllJogos() {
		return jogoRepository.findAll();
	}

	// apagar produto
	public void deleteJogo(Long id) {
		jogoRepository.deleteById(id);
	}

}

