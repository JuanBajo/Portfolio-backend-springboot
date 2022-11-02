package com.yoprogramo.portfoliopersonal.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yoprogramo.portfoliopersonal.model.Persona;
import com.yoprogramo.portfoliopersonal.services.iPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@PreAuthorize("isAuthenticated()")
@CrossOrigin(origins = "*")
@RestController
public class PersonaController {

    @Autowired
    private iPersonaService personaServ;

    @PostMapping("/crear/persona")
    public void crearPersona(@RequestBody Persona p) {
        personaServ.newPersona(p);

    }

    @PreAuthorize("permitAll()")
    @GetMapping("/ver/persona/{id}")
    public Persona getPersona(@PathVariable Integer id) {
        System.out.println("ver persona");
        return personaServ.getPersona(id);
    }

    @DeleteMapping("/borrar/persona/{id}")
    public void deletePersona(@PathVariable Integer id) {
        personaServ.deletePersona(id);
    }

    @PreAuthorize("permitAll()")
    @GetMapping("/ver_activo")
    public Persona getPersonaActiva() {
        return personaServ.getPersonaActiva();
    }

    @PreAuthorize("permitAll()")
    @GetMapping("/id_activo")
    public Integer getIdActivo() {
        return personaServ.getIdActivo();
    }

}
