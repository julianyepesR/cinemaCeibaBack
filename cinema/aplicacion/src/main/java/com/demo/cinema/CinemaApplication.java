//package com.demo.cinema;
//
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.context.annotation.ComponentScan;
//
///**
// * Clase init de spring boot
// * 
// * @author jose.lozano
// *
// */
//@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
//@ComponentScan
//public class CinemaApplication extends SpringBootServletInitializer {
//	
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(CinemaApplication.class);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(CinemaApplication.class, args);
//	}
//
//}
