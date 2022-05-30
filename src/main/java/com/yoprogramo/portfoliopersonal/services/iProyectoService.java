
package com.yoprogramo.portfoliopersonal.services;

import org.springframework.stereotype.Service;
import com.yoprogramo.portfoliopersonal.model.Proyecto;
import java.util.List;

@Service
public interface iProyectoService {
    
    public void newProyecto(Proyecto p);
    public List<Proyecto> getAllProyectos();
    public void deleteProyecto(Integer id);
    
}
