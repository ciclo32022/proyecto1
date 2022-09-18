/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.parkapp.parkapp.views;

import co.parkapp.parkapp.controllers.VisitasJpaController;
import co.parkapp.parkapp.models.Visitas;

/**
 *
 * @author carmo
 */
public class Visitasview {

    public Visitasview() {
    }
    
    public void Insertarvisita(Visitas visitas){
        VisitasJpaController visitasJpaController=new VisitasJpaController();
        try {
            visitasJpaController.create(visitas);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("Visita almacenada con exito");
        }
    }
}
