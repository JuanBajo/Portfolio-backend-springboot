package com.yoprogramo.portfoliopersonal.repository;

import com.yoprogramo.portfoliopersonal.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer>{

    
    
}
