package com.yoprogramo.portfoliopersonal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@Table(name = "usuarios")

public class Usuario {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "user")
    private String nombreUsuario;
    
    
    @Column(name = "pass")
    private String pass;
    
    @Column(name = "email")
    private String email;   
    
    
   
    @Column(name = "status")
    private String status;
        
            @Column(name = "online")
    private int userOnline;
     
}



