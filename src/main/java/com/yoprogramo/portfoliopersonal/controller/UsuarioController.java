package com.yoprogramo.portfoliopersonal.controller;

import com.yoprogramo.portfoliopersonal.services.iUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yoprogramo.portfoliopersonal.model.Usuario;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.yoprogramo.portfoliopersonal.utils.JWTUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.yoprogramo.portfoliopersonal.DTO.UsuarioDTO;

@PreAuthorize("isAuthenticated()")
@CrossOrigin(origins = "*")
@RestController
public class UsuarioController {

    @Autowired
    public iUsuarioService userServ;

    @Autowired
    public JWTUtil jwt;

    @PostMapping("/crear/usuario")
    public void newUsuario(@RequestBody Usuario u) {
        userServ.newUsuario(u);
    }

    @DeleteMapping("/borrar/usuario/{id}")
    public void deleteUsuario(@PathVariable int id) {
        userServ.deleteUsuario(id);
    }

    @PreAuthorize("permitAll()")
    @PostMapping(value = "/login")
    public UsuarioDTO login(@RequestBody Usuario user) {
        return userServ.validarUsuarioPass(user);

    }
}
