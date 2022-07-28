package com.yoprogramo.portfoliopersonal.services;

import com.yoprogramo.portfoliopersonal.model.Proyecto;
import com.yoprogramo.portfoliopersonal.repository.ProyectoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProyectoService implements iProyectoService {

    @Autowired
    public ProyectoRepository proRepo;

    @Override
    public void newProyecto(Proyecto p) {
        proRepo.save(p);
    }

    @Override
    public List<Proyecto> getAllProyectos() {
        return proRepo.findAll();
    }

    @Override
    public void deleteProyecto(Integer id) {
        proRepo.deleteById(id);
    }

    @Override
    public List<Proyecto> getProyectoPersona(Integer id) {
        return proRepo.getProyectoPersona(id);
    }

}
