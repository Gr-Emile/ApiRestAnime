package com.aula.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.aula.entidades.Animes;
import com.aula.service.AnimeService;

@Controller
@RequestMapping("/")
public class AnimeController {
	
	@Autowired
	AnimeService service;
	
	@GetMapping("/biblioteca")
	public  ResponseEntity<List <Animes>>  getAnimes() {
		List <Animes> animes = (List<Animes>) service.getAnimes();
		return ResponseEntity.status(HttpStatus.OK).body(animes);
	}
	
	@GetMapping("/biblioteca/{idanimes}")
	public ResponseEntity<Animes> getAnimesById(@PathVariable("idanimes") int idanimes) {
		return ResponseEntity.ok(service.getAnimeById(idanimes));
	}

	@PutMapping("/biblioteca/{idanimes}")
	public  ResponseEntity<Animes>  alterarAnimes(@PathVariable("idanimes") int idanimes, @RequestBody Animes animes) {
		return ResponseEntity.ok(service.update(idanimes, animes));
	}
	
	@DeleteMapping("/biblioteca/{idanimes}")
	public  ResponseEntity<Object> deleteAnimes(@PathVariable("idanimes") int idanimes) {
		service.deleteById(idanimes);
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping("/biblioteca")
	public  ResponseEntity<Animes>  saveAnimes(@RequestBody Animes animes) {
		Animes an = service.save(animes);
		return ResponseEntity.status(HttpStatus.CREATED).body(an);
	}
}
