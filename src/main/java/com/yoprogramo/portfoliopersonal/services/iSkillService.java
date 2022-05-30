package com.yoprogramo.portfoliopersonal.services;

import org.springframework.stereotype.Service;
import com.yoprogramo.portfoliopersonal.model.Skill;
import java.util.List;




public interface iSkillService {
    
    public void newSkill(Skill sk);
    public List<Skill> getAllSkills();
    public void deleteSkill(Integer id);
    
    
    
}
