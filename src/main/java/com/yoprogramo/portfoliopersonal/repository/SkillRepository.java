package com.yoprogramo.portfoliopersonal.repository;

import org.springframework.stereotype.Repository;
import com.yoprogramo.portfoliopersonal.model.Skill;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

    @Query(value = "SELECT * FROM skills WHERE PERSONAS_id=:id", nativeQuery = true)
    public List<Skill> getSkillPersona(@Param("id") Integer id);

}
