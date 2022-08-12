package com.aula.repository;
import org.springframework.data.repository.CrudRepository;
import com.aula.entidades.Animes;

public interface IAnimeRepository extends CrudRepository<Animes,Integer>{

}
