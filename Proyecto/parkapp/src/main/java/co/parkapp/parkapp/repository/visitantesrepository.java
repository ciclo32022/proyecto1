package co.parkapp.parkapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import co.parkapp.parkapp.entity.Visitantes;


public interface visitantesrepository extends JpaRepository<Visitantes,Long>{
 
    @Query("FROM Visitantes v WHERE v.propietario LIKE :propietario")
    List<Visitantes>findByNameContainign(@Param("propietario")String propietario);

    @Query("FROM Visitantes v WHERE v.idPropietario LIKE :idPropietario")
    List<Visitantes>findByIdContainign(@Param("idPropietario")Integer idPropietario);

}
