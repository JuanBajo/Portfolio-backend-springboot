package com.yoprogramo.portfoliopersonal.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter

@Entity
@Table(name = "educacion")
public class Educacion {

    public Educacion() {
    }

    public Educacion(Integer id, String institucion, String carrera, String descripcion, Date fecha_egreso, Persona persona_id) {
        this.id = id;
        this.institucion = institucion;
        this.carrera = carrera;
        this.descripcion = descripcion;
        this.fechaEgreso = fecha_egreso;
        this.persona_id = persona_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "institucion")
    private String institucion;

    @Column(name = "carrera")
    private String carrera;

    @Column(name = "descripcion")
    private String descripcion;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fecha_egreso")
    private Date fechaEgreso;

    @ManyToOne
    @JoinColumn(name = "PERSONAS_id")
    private Persona persona_id;

}
