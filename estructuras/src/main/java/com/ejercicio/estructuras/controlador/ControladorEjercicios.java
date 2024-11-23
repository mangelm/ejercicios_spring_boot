package com.ejercicio.estructuras.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEjercicios {
	
	
	@PostMapping("/factorial")
	public String ejercicio8(@RequestParam int numero ) {
		long resultado = 1;
		String ret = "";
		
		if (numero < 0) {
			ret += "El número de ser mayor i gual a 0";
		}else {
			for (int i = 1; i <= numero; i++) {
				resultado *= i;
			}
			ret += "El factorial de " + numero + " es " + resultado;
		}
		
		
		
		return "<h1>"+ ret +"</h1>";
	}

}
	