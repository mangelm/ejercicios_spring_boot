package com.ejercicio.estructuras.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEjercicios {
	
	
	@PostMapping("/calcularIMC")
	public String ejercicio4(@RequestParam double peso, double altura ) {
		String ret = "";
		
		double imc = peso / (altura * altura);
		
		
		if (imc < 18.5) {
			//Formatear solo para 2 decimales
			ret = String.format("%.2f: Bajo Peso", imc);
		}else if ( imc >= 18.5 && imc <= 24.9) {
			ret = String.format("%.2f: Peso Saludable", imc); 
		}else if ( imc >= 25 && imc <= 29.9) {
			ret = String.format("%.2f: Sobrepeso", imc);
		}else if( imc >= 30) {
			ret = String.format("%.2f: Obesidad", imc);
		}
		
		return "<h1>"+ ret +"</h1>";
	}

}
	