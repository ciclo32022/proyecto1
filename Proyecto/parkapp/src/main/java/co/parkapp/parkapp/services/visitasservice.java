package co.parkapp.parkapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.parkapp.parkapp.entity.Visitantes;
import co.parkapp.parkapp.repository.visitantesrepository;

@Service
public class visitasservice implements ivisitasservice {

    private visitantesrepository visitasrepository;
    
    public visitasservice(visitantesrepository visitasrepository) {
        this.visitasrepository = visitasrepository;
    }

    @Override
    public List<Visitantes> getAllVisitas() {
        return visitasrepository.findAll();
    }

    @Override
    public List<Visitantes> getVisitasById(Integer id_propietario) {
        return visitasrepository.findByIdContainign(id_propietario);
    }

    @Override
    public List<Visitantes> getVisitasByName(String propietario) {
        return visitasrepository.findByNameContainign(propietario);
    }

    @Override
    public Visitantes saveVisitas(Visitantes visita) {
        return visitasrepository.save(null);
    }

    @Override
    public Visitantes getVisitantesById(Integer id_propietario) {
        return visitasrepository.getReferenceById(null);
    }

    @Override
    public Visitantes updateVisitas(Visitantes visita) {
        return visitasrepository.save(null);
    }

    @Override
    public void deleteVisitasById(Integer id_propietario) {
        visitasrepository.deleteById(null);
    }
    
}
