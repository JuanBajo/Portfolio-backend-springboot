package com.yoprogramo.portfoliopersonal.controller;


import com.yoprogramo.portfoliopersonal.services.iUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yoprogramo.portfoliopersonal.model.Usuario;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UsuarioController {

    @Autowired
    public iUsuarioService userServ;
    
    @PostMapping("/crear/usuario")
    public void newUsuario(@RequestBody Usuario u){
        userServ.newUsuario(u);
    }
    
    @PostMapping("/ver/usuario/{id}")
    public Usuario verUsuario(@PathVariable int id){
        return userServ.getUsuario(id);
        
    }

    @DeleteMapping("/borrar/usuario/{id}")
    public void deleteUsuario(@PathVariable int id){
        userServ.deleteUsuario(id);
    }
}
