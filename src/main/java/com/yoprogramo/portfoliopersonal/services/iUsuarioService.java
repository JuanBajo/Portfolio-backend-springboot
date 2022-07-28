package com.yoprogramo.portfoliopersonal.services;

import com.yoprogramo.portfoliopersonal.model.Usuario;
import com.yoprogramo.portfoliopersonal.DTO.UsuarioDTO;

public interface iUsuarioService {

    public void newUsuario(Usuario u);

    public Usuario getUsuario(int id);

    public void deleteUsuario(int id);

    public Usuario findByEmail(String email);

    public UsuarioDTO validarUsuarioPass(Usuario usuario);

    public String getJWTToken(Usuario usuario);

}
