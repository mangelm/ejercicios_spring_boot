package com.ejercicio.estructuras.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEjercicios {
	
	@PostMapping("/parImpar")
	public String ejercicio1(@RequestParam int numero ) {
		String ret = "";
		if(numero % 2 == 0) {
			ret+="Es par el " + numero;
		}else {
			ret+="Es impar el " + numero;
		}
		

		return "<h1>"+ ret +"</h1>";
	}

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
	