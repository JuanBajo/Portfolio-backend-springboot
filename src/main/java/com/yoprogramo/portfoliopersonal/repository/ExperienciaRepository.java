package com.yoprogramo.portfoliopersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yoprogramo.portfoliopersonal.model.Experiencia;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer>{
    
}
