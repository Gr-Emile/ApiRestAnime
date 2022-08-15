package com.aula.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.entidades.Animes;
import com.aula.repository.IAnimeRepository;



@Service
public class AnimeService {


	@Autowired
	IAnimeRepository repo;
	
	public Animes save(Animes anime) {
		return repo.save(anime);
	}
	
	public List<Animes> getAnimes(){
		List<Animes> animes = (List<Animes>) repo.findAll();
		 return animes;
	}

	public Animes getAnimeById(int idanimes) {
		Optional<Animes> opanimes = repo.findById(idanimes);
		Animes an = opanimes.orElseThrow(() -> new EntityNotFoundException("Anime não encontrado"));
		return an;
	}
	
	public void deleteById(int idanimes) {
		Animes an = getAnimeById(idanimes);
		repo.delete(an);
	}
	
	public Animes update(int idanimes, Animes animes){
		Animes an = getAnimeById(idanimes);
		an.setDuracaoDoEp(animes.getDuracaoDoEp());
		an.setLegendaDisponivel(animes.getLegendaDisponivel());
		an.setNome(animes.getNome());
		an.setNumeroTemporadas(animes.getNumeroTemporadas());
		an.setStreamDisponivel(animes.getStreamDisponivel());
		return repo.save(an);
	}
	
}
