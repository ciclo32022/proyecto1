/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.parkapp.parkapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import co.parkapp.parkapp.entity.Visitantes;

import co.parkapp.parkapp.services.visitasservice;

/**
 *
 * @author carmo
 */
@Controller
 public class VisitasJpaController {

    @Autowired
    private visitasservice Visitasservice;

    /*@Autowired
    private visitantesrepository Visitasrepository;
    
    private List<Visitantes> visitanteslist=new ArrayList<>();*/

    public VisitasJpaController(visitasservice Visitasservice) {
        this.Visitasservice = Visitasservice;
        //this.Visitasrepository = Visitasrepository;
        /*this.visitanteslist = visitanteslist;*/
    }

    public VisitasJpaController() {
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("visitas",Visitasservice.getAllVisitas());
        return "consulta_visita";
    }

    @GetMapping("/visitas")
    public String listVisitas(Model model){
        model.addAttribute("visitas",Visitasservice.getAllVisitas());
        return "consulta_visita";
    }

    @GetMapping("/visitas/new")
    public String createVisitaForm(Model model){
        Visitantes visitantes=new Visitantes();
        model.addAttribute("visitantes",visitantes);
        return "create_visita";
    }

    @PostMapping("/visitas")
    public String safeVisita(@ModelAttribute("visitantes") Visitantes visitantes){
        Visitasservice.saveVisitas(visitantes);
        return "redirect:/consulta_visita";
    }

    @GetMapping("/visitas/edit/{id_propietario}")
    public String editVisitaForm(@PathVariable Integer id_propietario,Model model){
        Visitantes vt= Visitasservice.getVisitantesById(id_propietario);
        model.addAttribute("visitantes",vt);
        return "editar_visita";
    }

    @PostMapping("/visitas/{id_propietario}")
    public String updateVisita(@PathVariable Integer id_propietario,@ModelAttribute("visitantes") Visitantes visitantes,Model model){
        Visitantes existenvisita= Visitasservice.getVisitantesById(id_propietario);
        existenvisita.setIdPropietario(id_propietario);
        existenvisita.setPropietario(visitantes.getPropietario());
        existenvisita.setHoraentrada(visitantes.getHoraentrada());
        existenvisita.setHorasalida(visitantes.getHorasalida());
        existenvisita.setEstado(visitantes.getEstado());
        existenvisita.setValorpagado(visitantes.getValorpagado());
        Visitasservice.updateVisitas(existenvisita);
        return "redirect:/consulta_visita";
    }

    @GetMapping("/visitas/{id_propietario}")
    public String deleteVisita(@PathVariable Integer id_propietario){
        Visitasservice.deleteVisitasById(id_propietario);
        return "redirect:/consulta_visita";
    }
}
