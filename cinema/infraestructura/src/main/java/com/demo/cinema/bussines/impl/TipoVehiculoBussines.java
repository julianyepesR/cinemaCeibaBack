//package com.demo.cinema.bussines.impl;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.demo.cinema.adapter.TipoVehiculoAdapter;
//import com.demo.cinema.dto.TipoVehiculoDTO;
//import com.demo.cinema.entity.TipoVehiculo;
//import com.demo.cinema.repository.TipoVehiculoRepository;
//
///**
// * clase manejadora del negocio de tipovehiculo
// * @author jose.lozano
// *
// */
//@Service
//public class TipoVehiculoBussines {
//
//	@Autowired
//	private TipoVehiculoRepository tipoVehiculoRepository;
//
//	public Collection<TipoVehiculoDTO> obtenerTipoVehiculos() {
//		Collection<TipoVehiculo> listaEntities = (Collection<TipoVehiculo>) tipoVehiculoRepository.findAll();
//		
//		Optional<Collection<TipoVehiculoDTO>> listaOptional = TipoVehiculoAdapter
//		.getInstance().getListaVehiculoDTO(listaEntities);
//		
//		return listaOptional.orElse(new ArrayList<>());
//	}
//}
