package com.yoprogramo.portfoliopersonal.services;

import com.yoprogramo.portfoliopersonal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yoprogramo.portfoliopersonal.model.Usuario;



@Service
public class UsuarioService implements iUsuarioService{
    
    @Autowired
    public UsuarioRepository usRepo;

    @Override
    public void newUsuario(Usuario u) {
        usRepo.save(u);
    }

    @Override
    public Usuario getUsuario(int id) {
        return usRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteUsuario(int id) {
        usRepo.deleteById(id);
    }
    

    
    
    
    
}
