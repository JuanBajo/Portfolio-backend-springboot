package com.yoprogramo.portfoliopersonal.services;

import com.yoprogramo.portfoliopersonal.model.Educacion;
import java.util.List;

public interface iEducacionService {

    public void newEducacion(Educacion edu);

    public List<Educacion> getAllEducacion();

    public void deleteEducacion(Integer id);

    public List<Educacion> getEducacionPersona(Integer id);

}
