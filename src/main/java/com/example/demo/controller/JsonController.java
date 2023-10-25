package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PersonaDTO;
import com.example.demo.dto.PersonaDTOLombok;
import com.example.demo.dto.PersonaRecord;

//JSON = JavaScript Object Notation
//DTO = Data Transport Object
@RestController
public class JsonController {
	
	//Microservicio que retorna una lista de objetos en formato json
	@PostMapping("/jsondtoclasico")
	public ResponseEntity<List<PersonaDTO>> primerJson() {
		PersonaDTO emmanuel = new PersonaDTO("Emmanuel",37,"Col. Portales Oriente");
		
		PersonaDTO emmanuel2 = new PersonaDTO();
		emmanuel2.setNombre("Benja");
		emmanuel2.setEdad(37);
		emmanuel2.setDomicilio("Col. Emiliano Zapata");
		
		return new ResponseEntity<>(List.of(emmanuel, emmanuel2),HttpStatus.OK);
		
	}
	
	@PostMapping("/jsonlombok")
	public ResponseEntity<List<PersonaDTOLombok>> segundoJson() {
		PersonaDTOLombok emmanuel = new PersonaDTOLombok("Emmanuel",37,"Col. Portales Oriente");

		PersonaDTOLombok emmanuel2 = new PersonaDTOLombok();
		emmanuel2.setNombre("Benja");
		emmanuel2.setEdad(37);
		emmanuel2.setDomicilio("Col. Emiliano Zapata");

		return new ResponseEntity<>(List.of(emmanuel, emmanuel2),HttpStatus.OK);

	}
	
	@PostMapping("/jsonrecords")
	public ResponseEntity<List<PersonaRecord>> jsonrecords() {
		PersonaRecord emmanuel = new PersonaRecord("Emmanuel",37,"Col. Portales Oriente");
		PersonaRecord mario = new PersonaRecord("Mario",55,"Col. Portales");

		return new ResponseEntity<>(List.of(emmanuel, mario),HttpStatus.OK);
	}
	
}
