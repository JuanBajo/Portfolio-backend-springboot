package com.yoprogramo.portfoliopersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yoprogramo.portfoliopersonal.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

    public Persona findByActivo(boolean activo);

}
