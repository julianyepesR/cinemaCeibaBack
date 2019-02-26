package com.demo.cinema.port;

import java.util.Collection;

import com.demo.cinema.entity.Pelicula;


public interface PeliculaFactoryInterface {

	public Collection<Pelicula> toPelicula();
}