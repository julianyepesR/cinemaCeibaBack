package com.demo.cinema.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.cinema.entity.ModelPelicula;


/**
 * repository de Pelicula Model
 * 
 * @author jose.lozano
 *
 */
@Repository
public interface PeliculaRepository extends CrudRepository<ModelPelicula, Integer> {

}
