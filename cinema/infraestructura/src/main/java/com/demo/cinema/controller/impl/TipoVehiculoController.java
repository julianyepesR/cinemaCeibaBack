package com.demo.cinema.controller.impl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 
 * @author jose.lozano
 *
 */
@RestControllerAdvice
@RestController
@RequestMapping(value="/tipovehiculo")
@CrossOrigin("*")
public class TipoVehiculoController {

//	@Autowired
//	private TipoVehiculoBussines tipoVehiculoBussines;
//    
//	@RequestMapping(value="/obtenerlista", method = RequestMethod.GET)
//	public ResponseEntity<Collection<TipoVehiculoDTO>> obtenerTipoVehiculos() {
//		return new ResponseEntity<>( tipoVehiculoBussines.obtenerTipoVehiculos() , HttpStatus.ACCEPTED);
//	}	

}
