package com.demo.cinema.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.cinema.entity.TipoVehiculo;

/**
 * repository de tipo vehiculo
 * 
 * @author jose.lozano
 *
 */
public interface TipoVehiculoRepository extends CrudRepository<TipoVehiculo, Integer> {

}
