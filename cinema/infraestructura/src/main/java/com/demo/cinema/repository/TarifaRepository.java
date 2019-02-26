package com.demo.cinema.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.demo.cinema.entity.Tarifa;


/**
 * repository de tipo parqueadero
 * 
 * @author jose.lozano
 *
 */
public interface TarifaRepository extends CrudRepository<Tarifa, Integer> {
	
	public Optional<Tarifa> findByCodigoTipoVehiculo(String codigoTipoVehiculo);

}
