package co.parkapp.parkapp.models.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.parkapp.parkapp.models.vo.visitasvo;

@Repository
public interface visitasdao extends CrudRepository<visitasvo,Integer> {
    
    public void Crearvisita(){
 
    }

    @Query("SELECT * FROM visitasvo WHERE id_propietario=elid_propietario")
    public visitasvo Consultarvisita(@Param("elid_propietario") Integer id_propietario){
    }

    public void Eliminarvisita(){
 
    }

    public void Actualizarvisita(){
 
    }
}
