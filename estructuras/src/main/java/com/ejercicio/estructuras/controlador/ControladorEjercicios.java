package com.ejercicio.estructuras.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEjercicios {
	
	
	@PostMapping("/tablaMultiplicar")
	public String ejercicio2(@RequestParam int numero ) {
		String ret = "";
		int operacion = 0;
		for (int i = 1; i <= 10; i++) {
	          operacion = numero * i;
	          ret += numero + "x" + i + "=" + operacion + "<br>";
	      }
		
		return "<h1>"+ ret +"</h1>";
		
	}
}
	