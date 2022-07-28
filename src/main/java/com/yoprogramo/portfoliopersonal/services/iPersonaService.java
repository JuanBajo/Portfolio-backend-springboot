package com.yoprogramo.portfoliopersonal.services;

import com.yoprogramo.portfoliopersonal.model.Persona;

public interface iPersonaService {

    public void newPersona(Persona p);

    public Persona getPersona(Integer id);

    public void deletePersona(Integer id);

    public Persona getPersonaActiva();

    public Integer getIdActivo();

}
