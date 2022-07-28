package com.yoprogramo.portfoliopersonal.controller;

import com.yoprogramo.portfoliopersonal.model.Experiencia;
import com.yoprogramo.portfoliopersonal.services.iExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@PreAuthorize("isAuthenticated()")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ExperienciaController {

    @Autowired
    public iExperienciaService expSer;

    @PostMapping("/crear/experiencia")
    public void newExperiencia(@RequestBody Experiencia exp) {
        expSer.newExpericencia(exp);
    }

    @PreAuthorize("permitAll()")
    @GetMapping("/ver_experiencias")
    public List<Experiencia> getAllExperiencias() {
        return expSer.getAllExperiencias();
    }

    @PreAuthorize("permitAll()")
    @GetMapping("/ver_experiencias/{id}")
    public List<Experiencia> getExperienciaPersona(@PathVariable Integer id) {

        return expSer.getExperienciaPersona(id);
    }

    @DeleteMapping("/borrar/experiencias/{id}")
    public void deleteExperiencia(@PathVariable Integer id) {
        expSer.deleteExperiencia(id);
    }

}
