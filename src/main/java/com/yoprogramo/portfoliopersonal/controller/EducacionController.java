package com.yoprogramo.portfoliopersonal.controller;

import com.yoprogramo.portfoliopersonal.model.Educacion;
import com.yoprogramo.portfoliopersonal.services.iEducacionService;
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
public class EducacionController {

    @Autowired
    public iEducacionService eduServ;
    
    
    @PostMapping("/crear/educacion")
    public void newEducacion(@RequestBody Educacion edu) {
        eduServ.newEducacion(edu);
    }

    @PreAuthorize("permitAll()")
    @GetMapping("/ver_educacion")
    public List<Educacion> getAllEducacion() {
        return eduServ.getAllEducacion();
    }

    @DeleteMapping("/borrar/educacion/{id}")
    public void deleteEducacion(@PathVariable Integer id) {
        eduServ.deleteEducacion(id);
    }

    @PreAuthorize("permitAll()")
    @GetMapping("/ver_educacion/{id}")
    public List<Educacion> getEducacionPersona(@PathVariable Integer id) {
        return eduServ.getEducacionPersona(id);
    }
}
