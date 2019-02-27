package com.demo.cinema.pelicula.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.demo.cinema.entity.Pelicula;
import com.demo.cinema.pelicula.SelectAllPeliculaQueryHandle;

/**
 * 
 * @author jose.lozano
 *
 */
@RestControllerAdvice
@RestController
@RequestMapping(value="/pelicula")
@CrossOrigin("*")
public class SelectAllPeliculasController {

	@Autowired
	private SelectAllPeliculaQueryHandle queryHandler;
    
	// TODO: mirar el tema de los verbos - peliculas (listar) :
	@RequestMapping(value="/listar", method = RequestMethod.GET)
	public ResponseEntity<Collection<Pelicula>> obtenerTipoVehiculos() {
		return new ResponseEntity<>( queryHandler.handle(null) , HttpStatus.ACCEPTED);
	}	

}
