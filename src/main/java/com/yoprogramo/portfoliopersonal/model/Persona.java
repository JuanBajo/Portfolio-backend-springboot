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
@Table(name = "personas")
public class Persona {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "url_foto")
    private String url_foto;
    
    @Column(name = "titulo")
    private String titulo;
    
    @Column(name = "about")
    private String about;
}



