package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Formateur;
import com.codingtech.gestionformation.entity.Formation;
import com.codingtech.gestionformation.entity.Participant;
import com.codingtech.gestionformation.security.entity.User;

import java.util.List;
import java.util.Set;

public interface FormationService {
    List<Formation> getAllFormations();

    Formation getFormationById(int id);

    Formation saveFormation(Formation formation);

    void deleteFormation(int id);



    Formation assignFormateurToFormation(int formationId, Formateur formateur);



    Formation addParticipantsToFormation(int formationId, List<Participant> participants);
}
