package com.codingtech.gestionformation.repo;

import com.codingtech.gestionformation.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepo extends JpaRepository<Personne,Integer> {
}
