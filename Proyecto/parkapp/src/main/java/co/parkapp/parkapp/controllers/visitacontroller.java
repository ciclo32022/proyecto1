package co.parkapp.parkapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import co.parkapp.parkapp.models.dao.visitasdao;

@Controller
public class visitacontroller {

	@Autowired
	private visitasdao visitadao;

	
}
