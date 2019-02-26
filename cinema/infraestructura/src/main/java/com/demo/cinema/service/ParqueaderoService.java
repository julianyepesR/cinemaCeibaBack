package com.demo.cinema.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.cinema.entity.Parqueadero;
import com.demo.cinema.repository.ParqueaderoRepository;
import com.demo.cinema.utils.ConstantesParqueadero;

/**
 * clase service para Parqueadero
 * 
 * @author jose.lozano
 *
 */
@Service
public class ParqueaderoService {

	@Autowired
	private ParqueaderoRepository parqueaderoRepository;

	/**
	 * metodo que registra parqueadero
	 */
	public Parqueadero crear(Parqueadero entity) {
		return parqueaderoRepository.save(entity);
	}

	/**
	 * 
	 */
	public Collection<Parqueadero> obtenerListaParqueadero(){
		return parqueaderoRepository.findByEstado(ConstantesParqueadero.ASIGNADO);
	}

	/**
	 * 
	 */
	public Optional<Parqueadero> obtenerParqueadero(Integer id) {
		return parqueaderoRepository.findById(id);
	}

	/**
	 * 
	 */
	public Optional<Integer> obtenerCupoParqueadero(String estado, Integer idTipoVehiculo) {
		return parqueaderoRepository.obtenerCupoParqueadero(estado, idTipoVehiculo);
	}
	
	/**
	 * metodo que registra parqueadero
	 */
	public Parqueadero registrarPago(Parqueadero entity) {
		return parqueaderoRepository.save(entity);
	}
	
}
