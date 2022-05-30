
package com.yoprogramo.portfoliopersonal.services;

import com.yoprogramo.portfoliopersonal.model.Persona;
import com.yoprogramo.portfoliopersonal.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements iPersonaService{

    
    @Autowired
    public PersonaRepository persoRepo;
    
    
    @Override
    public void newPersona(Persona p) {
        persoRepo.save(p);
    }

    @Override
    public Persona getPersona(Integer id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void deletePersona(Integer id) {
        persoRepo.deleteById(id);
    }
    
}
