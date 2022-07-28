package com.yoprogramo.portfoliopersonal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuarios")

public class Usuario {

    public Usuario() {
    }

    public Usuario(int id, String pass, String email) {
        this.id = id;
        this.pass = pass;
        this.email = email;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "pass")
    private String pass;

    @Column(name = "email")
    private String email;

}
