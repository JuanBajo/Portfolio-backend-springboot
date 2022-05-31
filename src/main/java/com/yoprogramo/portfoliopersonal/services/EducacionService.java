package com.yoprogramo.portfoliopersonal.services;

import com.yoprogramo.portfoliopersonal.model.Educacion;
import com.yoprogramo.portfoliopersonal.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements iEducacionService{

    
    @Autowired
    public EducacionRepository eduRepo;
    
    @Override
    public void newEducacion(Educacion edu) {
      eduRepo.save(edu);
    }
    @Override
    public List<Educacion> getAllEducacion() {
       return eduRepo.findAll();
    }

    @Override
    public void deleteEducacion(Integer id) {
        eduRepo.deleteById(id);
    }
    
}
