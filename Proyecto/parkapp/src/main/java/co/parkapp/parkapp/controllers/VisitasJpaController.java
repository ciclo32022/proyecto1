/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.parkapp.parkapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author carmo
 */
@Controller
 public class VisitasJpaController {
    @RequestMapping("/")
    public String crearvisita(){
        return "create_visita";
    }

    @RequestMapping("/consultar")
    public String consultavisita(){
        return "consulta_visita";
    }

    @RequestMapping("/editar")
    public String editvisita(){
        return "editar_visita";
    }
}
