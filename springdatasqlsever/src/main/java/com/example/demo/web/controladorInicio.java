package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.DAO.PersonaDAO;

@Controller
public class controladorInicio {
	
	@Autowired
	private PersonaDAO perDAO;
	
	
	@GetMapping("/")
	
	public String Inicio() {
		
		var MostrarPersonas = perDAO.findAll();
		
		for (var iteracion:MostrarPersonas) {
			
			System.out.print("nombre "+iteracion.getNombre() + "Apellido "+ iteracion.getApellido());
			
			
		}
		
		return "Index";
		
	}

}
