package com.yoprogramo.portfoliopersonal.DTO;

import com.yoprogramo.portfoliopersonal.model.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UsuarioDTO {

    private String email;
    private String token;
    private String status;

    public UsuarioDTO(Usuario usuario, String token, String status) {
        this.email = usuario.getEmail();
        this.token = token;
        this.status = status;
    }

    public UsuarioDTO() {
    }

}
