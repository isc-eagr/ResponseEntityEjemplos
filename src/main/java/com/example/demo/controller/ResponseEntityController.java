package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseEntityController {
	
	//Microservicio que retorna un Estatus HTTP 401
	@PostMapping("/primerstatus")
	public ResponseEntity<String> primerStatus() {
		String holaMundo = "Error de autenticación";
		return new ResponseEntity<>(holaMundo,HttpStatus.UNAUTHORIZED);
		
	}
	
	//Microservicio que retorna un Estatus HTTP
	@PostMapping("/autenticacion/{user}/{password}")
	public ResponseEntity<String> primerStatus(@PathVariable String user, @PathVariable String password) {
		
		if(user.equals("Emmanuel") && password.equals("Emmanuel")) {
			return new ResponseEntity<>("Bienvenido, tienes acceso",HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Credenciales inválidas",HttpStatus.UNAUTHORIZED);	
		}
	}
	
	//Microservicio que retorna un Estatus HTTP 401
	@PostMapping("/formaVieja")
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	public String formaViejaStatus() {
		String holaMundo = "Error de autenticación";
		return holaMundo;
	}
}
