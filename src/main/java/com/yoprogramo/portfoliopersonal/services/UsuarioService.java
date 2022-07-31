package com.yoprogramo.portfoliopersonal.services;

import com.yoprogramo.portfoliopersonal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yoprogramo.portfoliopersonal.model.Usuario;
import java.util.Objects;
import com.yoprogramo.portfoliopersonal.DTO.UsuarioDTO;
import com.yoprogramo.portfoliopersonal.utils.JWTUtil;

@Service
public class UsuarioService implements iUsuarioService {

    @Autowired
    private UsuarioRepository usRepo;

    @Autowired
    private JWTUtil jwt;

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

    @Override
    public Usuario findByEmail(String email) {
        return usRepo.findByEmail(email);
    }

    @Override
    public UsuarioDTO validarUsuarioPass(Usuario usuario) {
        UsuarioDTO usrRes = new UsuarioDTO();
        Usuario usrBD = usRepo.findByEmail(usuario.getEmail());
        if (usrBD == null) {
            
            usrRes.setEmail(usuario.getEmail());
            usrRes.setToken(null);
            usrRes.setStatus("El usuario " + usuario.getEmail() + " no existe");
            usrRes.setCodStatus(-1);
            return usrRes;
        } else {
            if (Objects.equals(usrBD.getPass(), usuario.getPass())) {
                
                usrRes.setEmail(usuario.getEmail());
                usrRes.setToken(getJWTToken(usrBD));
                usrRes.setStatus("El usuario " + usuario.getEmail() + " ha sido logueado correctamente");
                usrRes.setCodStatus(1);
                return usrRes;
            } else {
                    usrRes.setEmail(usuario.getEmail());
                    usrRes.setToken(null);
                    usrRes.setStatus("La clave es incorrecta");
                    usrRes.setCodStatus(-1);
                return usrRes;
            }
        }
    }

    @Override
    public String getJWTToken(Usuario usuario) {
        return jwt.create(String.valueOf(usuario.getId()), usuario.getEmail());

    }

}
