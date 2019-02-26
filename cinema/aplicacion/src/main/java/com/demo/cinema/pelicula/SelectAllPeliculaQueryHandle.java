package com.demo.cinema.pelicula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.cinema.QueryHandleInterface;
import com.demo.cinema.entity.Pelicula;
import com.demo.cinema.repository.PeliculaRepository;

@Component
public class SelectAllPeliculaQueryHandle implements QueryHandleInterface<PeliculaQuery, List<Pelicula>> {

    @Autowired
    private PeliculaRepository repository;


    @Override
    public List<Pelicula> handle(PeliculaQuery query) {

        return null;// this.repository.findAll();

    }
}
