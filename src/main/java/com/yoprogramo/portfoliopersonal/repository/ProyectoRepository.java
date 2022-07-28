package com.yoprogramo.portfoliopersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yoprogramo.portfoliopersonal.model.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {

    @Query(value = "SELECT * FROM Proyectos WHERE PERSONAS_id=:id", nativeQuery = true)
    public List<Proyecto> getProyectoPersona(@Param("id") Integer id);

}
