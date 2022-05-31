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
@Table(name = "experiencias")
public class Experiencia {
    
    public Experiencia() {
    }

    public Experiencia(Integer id, String empresa, String puesto, String ciudad, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.ciudad = ciudad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        
    }
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "empresa")
    private String empresa;
    
    @Column(name = "puesto")
    private String puesto;
    
    @Column(name = "ciudad")
    private String ciudad;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fecha_fin")
    private Date fechaFin;
    
  
    @ManyToOne
    @JoinColumn(name = "PERSONAS_id")
    public Persona persona_id;


   
}
