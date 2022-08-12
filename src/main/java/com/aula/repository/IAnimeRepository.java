package com.aula.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aula.entidades.Animes;
@Repository
public interface IAnimeRepository extends CrudRepository<Animes,Integer>{

}
