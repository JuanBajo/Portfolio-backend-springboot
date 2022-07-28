package com.yoprogramo.portfoliopersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yoprogramo.portfoliopersonal.model.Experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer> {

    @Query(value = "SELECT * FROM experiencias WHERE PERSONAS_id=:id", nativeQuery = true)
    public List<Experiencia> getExperienciaXPersona_Id(@Param("id") Integer persona_id);

}
