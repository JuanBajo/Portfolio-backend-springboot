package com.yoprogramo.portfoliopersonal.repository;

import org.springframework.stereotype.Repository;
import com.yoprogramo.portfoliopersonal.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{
    
}
