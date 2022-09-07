package co.parkapp.parkapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class visitacontroller {

	@GetMapping("/login.html")
    private String verificarlogin(){
		return null;
	}
}
