package com.ejercicio.estructuras.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEjercicios {
	
	
	@PostMapping("/promedioCalificaciones")
	public String ejercicio3(@RequestParam String calificaciones ) {
		String ret = "";
		double promedio = 0.0;
		String[] notas = calificaciones.split(",");
		double suma = 0;
		
		for (String nota: notas) {
			suma += Double.parseDouble(nota.trim());
		}
		
		promedio = suma / notas.length;
		
		if (promedio >= 5) {
			ret += "El promedio del usuario es " + promedio + " por lo tanto está aprobado."; 
		}else {
			ret += "El promedio del usuario es " + promedio + " por lo tanto está suspendido.";
		}
		
		return "<h1>"+ ret +"</h1>";
	}

}
	