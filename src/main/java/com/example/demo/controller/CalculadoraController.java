package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CalculadoraRecord;

@RestController
public class CalculadoraController {

	@PostMapping("/calculadora")
	public String calculadora(@RequestBody CalculadoraRecord calculadora){

		return switch(calculadora.operacion()) {
			case SUMA -> String.valueOf(calculadora.numero1()+calculadora.numero2());
			case RESTA-> String.valueOf(calculadora.numero1()-calculadora.numero2());
			case MULTIPLICACION-> String.valueOf(calculadora.numero1()*calculadora.numero2());
			case DIVISION-> String.valueOf(calculadora.numero1()/calculadora.numero2());
			default-> "Operación no válida";
		}; 

	}

}
