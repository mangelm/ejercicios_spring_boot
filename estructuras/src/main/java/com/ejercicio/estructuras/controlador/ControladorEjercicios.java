package com.ejercicio.estructuras.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEjercicios {
	
	
	@PostMapping("/sumatoria")
	public String ejercicio7(@RequestParam int numero ) {
		int resultado = 0;
		
	 for (int i = 1; i <= numero; i++) { 
	        resultado += i;
	    }
		
		return "<h1>"+ "El resultado de la suma acumulativa de " + numero + " es "+ resultado  +"</h1>";
	}

}
	