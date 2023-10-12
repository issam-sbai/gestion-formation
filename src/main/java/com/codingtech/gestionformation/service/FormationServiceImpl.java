package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Formateur;
import com.codingtech.gestionformation.entity.Formation;
import com.codingtech.gestionformation.entity.Participant;
import com.codingtech.gestionformation.repo.FormationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class FormationServiceImpl implements FormationService {

    private final FormationRepo formationRepository;

    @Autowired
    public FormationServiceImpl(FormationRepo formationRepository) {
        this.formationRepository = formationRepository;
    }

    @Override
    public List<Formation> getAllFormations() {
        return formationRepository.findAll();
    }

    @Override
    public Formation getFormationById(int id) {
        return formationRepository.findById(id).orElse(null);
    }

    @Override
    public Formation saveFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    @Override
    public void deleteFormation(int id) {
        formationRepository.deleteById(id);
    }


    @Override
    public Formation assignFormateurToFormation(int formationId, Formateur formateur) {
        // Implement the logic to assign a formateur to a formation
        Formation formation = null;
        Optional<Formation> optionalFormation = formationRepository.findById(formationId);
        if (optionalFormation.isPresent()) {
            formation = optionalFormation.get();
            formation.setFormateur(formateur);
            return formationRepository.save(formation);
        }
        return formation;
    }

    // Define additional methods as needed

    @Override
    public Formation addParticipantsToFormation(int formationId, List<Participant> participants) {

        Optional<Formation> optFormation = formationRepository.findById(formationId);

        if (optFormation.isPresent()) {
                participants.forEach(p -> {
                optFormation.get().getParticipants().add(p);
            });
        } else {
                 System.out.println("Optional is empty.");
        }

       /* System.out.println();
        List<Participant> existingParticipants = formation.getParticipants();
        existingParticipants.addAll(participants);
        System.out.println(existingParticipants);

        // Add participants to the formation
        /*List<Participant> existingParticipants = formation.getParticipants();
        existingParticipants.addAll(participants);
        formation.setParticipants(existingParticipants);
        System.out.println(formation);
        // Save the updated formation*/
        return null;//formationRepository.save(formation);
    }

}

