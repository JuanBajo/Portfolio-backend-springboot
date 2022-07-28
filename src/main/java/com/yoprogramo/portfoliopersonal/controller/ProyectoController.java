package com.yoprogramo.portfoliopersonal.controller;

import com.yoprogramo.portfoliopersonal.model.Proyecto;
import com.yoprogramo.portfoliopersonal.services.iProyectoService;
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
public class ProyectoController {

    @Autowired
    public iProyectoService proServ;

    @PostMapping("/crear/proyecto")
    public void newProyecto(@RequestBody Proyecto p) {
        proServ.newProyecto(p);

    }

    @PreAuthorize("permitAll()")
    @GetMapping("/ver_proyectos")
    public List<Proyecto> getSkills() {
        return proServ.getAllProyectos();
    }

    @DeleteMapping("/borrar/proyecto/{id}")
    public void deleteProyecto(@PathVariable Integer id) {
        proServ.deleteProyecto(id);
    }

    @PreAuthorize("permitAll()")
    @GetMapping("/ver_proyectos/{id}")
    public List<Proyecto> getProyectoPersona(@PathVariable Integer id) {
        return proServ.getProyectoPersona(id);
    }
}
