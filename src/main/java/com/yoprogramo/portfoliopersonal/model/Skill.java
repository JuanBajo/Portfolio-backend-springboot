package com.yoprogramo.portfoliopersonal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "skills")

public class Skill {

    public Skill(Integer id, String skill, Integer valoracion, Persona persona_id) {
        this.id = id;
        this.skill = skill;
        this.valor = valoracion;
        this.persona_id = persona_id;
    }

    public Skill() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "skill")
    private String skill;

    @Column(name = "valoracion")
    private Integer valor;

    @ManyToOne
    @JoinColumn(name = "PERSONAS_id")
    private Persona persona_id;

}
