package com.codingtech.gestionformation.repo;

import com.codingtech.gestionformation.entity.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepo extends JpaRepository<Formation,Integer> {
}
