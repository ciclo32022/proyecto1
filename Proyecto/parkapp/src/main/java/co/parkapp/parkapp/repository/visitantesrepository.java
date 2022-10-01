package co.parkapp.parkapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import co.parkapp.parkapp.entity.Visitantes;


public interface visitantesrepository extends JpaRepository<Visitantes,Long>{
 
    @Query("FROM Visitantes v WHERE v.propietario LIKE :propietario")
    List<Visitantes>findByNameContainign(@Param("propietario")String propietario);

    @Query("FROM Visitantes v WHERE v.id_propietario LIKE :id_propietario")
    List<Visitantes>findByIdContainign(@Param("id_propietario")Integer id_propietario);

}
