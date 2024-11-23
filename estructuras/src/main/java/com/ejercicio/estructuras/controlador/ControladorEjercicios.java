package com.ejercicio.estructuras.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEjercicios {
	
	
	@PostMapping("/encuesta")
	public String ejercicio5(@RequestParam int satisfaccion ) {
		String ret = "";
		
		ret = "Su respuesta es: " + satisfaccion + " Gracias por su tiempo.";
		
		return "<h1>"+ ret +"</h1>";
	}

}
	