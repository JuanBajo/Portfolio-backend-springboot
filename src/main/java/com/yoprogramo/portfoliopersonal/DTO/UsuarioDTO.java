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
    private Integer codStatus;

    public UsuarioDTO(Usuario usuario, String token, String status, Integer codStatus) {
        this.email = usuario.getEmail();
        this.token = token;
        this.status = status;
        this.codStatus = codStatus;
    }

    public UsuarioDTO() {
    }

}
