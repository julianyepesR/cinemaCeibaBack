package com.demo.cinema.controller.impl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@RestController
@RequestMapping(value="/parqueadero")
@CrossOrigin("*")
public class ParqueaderoController {

//	@Autowired
//	private ParqueaderoBussines parqueaderoBussines;
//
//	@RequestMapping(value="/crear", method = RequestMethod.POST)
//	public ResponseEntity<ParqueaderoDTO> crear(@RequestBody ParqueaderoDTO parqueaderoDTO) {
//		return new ResponseEntity<>( parqueaderoBussines.crear(parqueaderoDTO) , HttpStatus.ACCEPTED);
//	}
//
//	@RequestMapping(value="/obtenerLista", method = RequestMethod.GET)
//	public ResponseEntity<Collection<ParqueaderoDTO>> obtenerListaPaequeadero() {
//		return new ResponseEntity<>( parqueaderoBussines.obtenerListaParqueadero(), HttpStatus.ACCEPTED);
//	}
//
//	@RequestMapping(value="/obtenerparqueadero", method = RequestMethod.POST)
//	public ResponseEntity<ParqueaderoDTO> obtenerParqueadero(@RequestBody ParqueaderoDTO parqueaderoDTO) {
//		return new ResponseEntity<>( parqueaderoBussines.obtenerParqueadero(parqueaderoDTO), HttpStatus.ACCEPTED);
//	}
//
//	@RequestMapping(value="/regitrarpago", method = RequestMethod.POST)
//	public ResponseEntity<ParqueaderoDTO> registrarPago( @RequestBody ParqueaderoDTO parqueaderoDTO) {
//		return new ResponseEntity<>( parqueaderoBussines.registrarPago(parqueaderoDTO), HttpStatus.ACCEPTED);
//	}

}
