package com.yoprogramo.portfoliopersonal.services;
import com.yoprogramo.portfoliopersonal.model.Usuario;

public interface iUsuarioService {
    
    public void newUsuario(Usuario u);
    public Usuario getUsuario(int id);
    public void deleteUsuario(int id);
    
}
