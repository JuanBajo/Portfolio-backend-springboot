package com.yoprogramo.portfoliopersonal.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yoprogramo.portfoliopersonal.model.Persona;
import com.yoprogramo.portfoliopersonal.services.iPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class PersonaController {


    @Autowired
    private iPersonaService personaServ;
    
    
    @PostMapping("/crear/persona")
    public void crearPersona(@RequestBody Persona p){
        personaServ.newPersona(p);
              
    }
    
    @PostMapping ("/ver/persona/{id}")
    public Persona getPersona(@PathVariable Integer id){
       return personaServ.getPersona(id);
    }
           
    @DeleteMapping ("/borrar/persona/{id}")
    public void deletePersona(@PathVariable Integer id){
        personaServ.deletePersona(id);
    }
    
}
