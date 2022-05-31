package com.yoprogramo.portfoliopersonal.services;

import com.yoprogramo.portfoliopersonal.model.Experiencia;
import com.yoprogramo.portfoliopersonal.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienciaService implements iExperienciaService{
    
    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public void newExpericencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public List<Experiencia> getAllExperiencias() {
        return expRepo.findAll();
    }

    @Override
    public void deleteExperiencia(Integer id) {
        expRepo.deleteById(id);
    }
    
}
