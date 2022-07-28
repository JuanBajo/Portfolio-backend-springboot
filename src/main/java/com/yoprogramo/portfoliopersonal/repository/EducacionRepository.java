package com.yoprogramo.portfoliopersonal.repository;

import com.yoprogramo.portfoliopersonal.model.Educacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer> {

    @Query(value = "SELECT * FROM Educacion WHERE PERSONAS_id=:id", nativeQuery = true)
    public List<Educacion> getEducacionPersona(@Param("id") Integer id);

}
