package com.demo.cinema.adapter;

import java.util.Optional;

import com.demo.cinema.entity.Empleado;
import com.demo.cinema.entity.EmpleadoDTO;

/**
 * 
 * @author jose.lozano
 *
 */
public final class EmpleadoAdapter {

	/**
	 * Constructor privado de la clase
	 */
	private EmpleadoAdapter () {}

	/**
	 * metodo que obtiene la instancia de la clase
	 */
	public static EmpleadoAdapter getInstance() {
		return new EmpleadoAdapter();
	}

	/**
	 * transforma de objeto a entidad
	 */
	public Optional<Empleado> obtenerEntidad(final EmpleadoDTO empleadoDTO) {
		return Optional.of(Empleado.builder()
				.id(empleadoDTO.getId())
				.nombres(empleadoDTO.getNombres())
				.apellidos(empleadoDTO.getApellidos())
				.cargo(empleadoDTO.getCargo())
				.build());
	}

	/**
	 * transforma de entidad a objeto
	 */
	public Optional<EmpleadoDTO> obtenerDTO(final Empleado empleado){
		return null;
//				Optional.of(EmpleadoDTO.builder()
//				.id(empleado.getId())
//				.nombres(empleado.getNombres())
//				.apellidos(empleado.getApellidos())
//				.cargo(empleado.getCargo())
//				.build());
	}

}
