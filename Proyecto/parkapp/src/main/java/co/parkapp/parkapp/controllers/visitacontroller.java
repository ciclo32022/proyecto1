package co.parkapp.parkapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class visitacontroller {

	@GetMapping("/bienvenida")
    private String verificarlogin(){
		System.out.println("bienvenida");

		/*String nombreusuario= "homero";
		modelo.addAttribute("Nombre", nombreusuario);*/
		return "bienvenida";
	}
}
