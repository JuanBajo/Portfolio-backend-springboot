package com.yoprogramo.portfoliopersonal.controller;

import com.yoprogramo.portfoliopersonal.services.iSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.yoprogramo.portfoliopersonal.model.Skill;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class SkillController {
    
    
    @Autowired
    public iSkillService skServ;
    
    
    @PostMapping("/crear/skill")
    public void newSkill(@RequestBody Skill sk){
        skServ.newSkill(sk);
    }
    
    @GetMapping("/ver_skills")
    public List<Skill> getSkills(){
        return skServ.getAllSkills();
    }
    
    @DeleteMapping("borrar/skill/{id}")
    public void deleteSkills(@PathVariable Integer id){
        skServ.deleteSkill(id);
    }
    
    
}
