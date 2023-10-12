package com.codingtech.gestionformation.repo;

import com.codingtech.gestionformation.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepo extends JpaRepository<Participant,Integer> {
}
