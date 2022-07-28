package com.yoprogramo.portfoliopersonal.services;

import com.yoprogramo.portfoliopersonal.model.Experiencia;
import java.util.List;

public interface iExperienciaService {

    public void newExpericencia(Experiencia exp);

    public List<Experiencia> getAllExperiencias();

    public void deleteExperiencia(Integer id);

    public List<Experiencia> getExperienciaPersona(Integer persona_id);

}
