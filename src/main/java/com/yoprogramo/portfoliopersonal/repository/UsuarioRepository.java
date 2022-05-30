package com.yoprogramo.portfoliopersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yoprogramo.portfoliopersonal.model.Usuario;



@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
