package co.parkapp.parkapp.services;

import java.util.List;

import co.parkapp.parkapp.entity.Visitantes;


public interface ivisitasservice {
    
    List<Visitantes>getAllVisitas();
    List<Visitantes>getVisitasById(Integer id_propietario);
    List<Visitantes>getVisitasByName(String propietario);
    
    Visitantes saveVisitas(Visitantes visita);
    Visitantes getVisitantesById(Integer id_propietario);
    Visitantes updateVisitas(Visitantes visita);
    void deleteVisitasById(Integer id_propietario);

}
