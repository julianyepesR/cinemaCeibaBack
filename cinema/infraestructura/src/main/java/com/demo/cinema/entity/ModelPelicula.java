package com.demo.cinema.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the tarifa database table.
 * 
 */
@Entity
@NamedQuery(name="ModelPelicula.findAll", query="SELECT t FROM ModelPelicula t")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModelPelicula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="titulo")
	private String titulo;

	@Column(name="genero")
	private String genero;

	@Column(name="fecha_estreno")
	private Timestamp fechaEstreno;

}