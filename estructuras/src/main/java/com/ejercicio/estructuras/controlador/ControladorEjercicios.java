package com.ejercicio.estructuras.controlador;

import java.security.SecureRandom;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEjercicios {
	
	
	@PostMapping("/generarContrasena")
	public String ejercicio6(@RequestParam int longitud ) {
		String ret = "";
		String Caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
		String contrasena = "";
		if(longitud <= 0) {
			ret+="La longitud debe ser mayor que 0";
		}else {
			SecureRandom random = new SecureRandom();
			
			for (int i = 0; i < longitud; i++) {
				int index = random.nextInt(Caracteres.length());
				contrasena += Caracteres.charAt(index);
			}
			
			ret += "Tu contraseña random es:" + contrasena ;
		}
		
		
		return "<h1>"+ ret +"</h1>";
	}

}
	