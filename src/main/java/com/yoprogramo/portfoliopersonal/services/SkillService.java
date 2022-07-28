package com.yoprogramo.portfoliopersonal.services;

import com.yoprogramo.portfoliopersonal.model.Skill;
import com.yoprogramo.portfoliopersonal.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements iSkillService {

    @Autowired
    public SkillRepository skillRepo;

    @Override
    public void newSkill(Skill sk) {
        skillRepo.save(sk);
    }

    @Override
    public List<Skill> getAllSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void deleteSkill(Integer id) {
        skillRepo.deleteById(id);
    }

    @Override
    public List<Skill> getSkillPersona(Integer id) {
        return skillRepo.getSkillPersona(id);
    }

}
