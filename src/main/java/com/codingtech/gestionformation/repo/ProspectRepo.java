package com.codingtech.gestionformation.repo;

import com.codingtech.gestionformation.entity.Prospect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProspectRepo extends JpaRepository<Prospect,Integer> {
}
