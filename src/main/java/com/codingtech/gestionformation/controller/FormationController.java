package com.codingtech.gestionformation.controller;

import com.codingtech.gestionformation.entity.Formateur;
import com.codingtech.gestionformation.entity.Formation;
import com.codingtech.gestionformation.entity.Participant;
import com.codingtech.gestionformation.security.entity.User;
import com.codingtech.gestionformation.service.FormateurService;
import com.codingtech.gestionformation.service.FormationService;
import com.codingtech.gestionformation.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/formations")
public class FormationController {

    private final FormationService formationService;
    private final FormateurService formateurService;

    @Autowired
    public FormationController(FormationService formationService, FormateurService formateurService) {

        this.formationService = formationService;
        this.formateurService = formateurService;
    }

    @GetMapping("")
    public List<Formation> getAllFormations() {
        return formationService.getAllFormations();
    }

    @GetMapping("/{id}")
    public Formation getFormationById(@PathVariable int id) {

        return formationService.getFormationById(id);
    }

    @PostMapping("/add")
    public Formation saveFormation(@RequestBody Formation formation) {
        return formationService.saveFormation(formation);
    }

    @PutMapping ("/{id}/assign-formateur")
    public Formation assignFormateurToFormation(
            @PathVariable int id,
            @RequestBody Formateur id_formateur
    ) {

        System.out.println(id_formateur);
        Formateur formateur =formateurService.getFormateurById(id_formateur.getId());
        return formationService.assignFormateurToFormation(id, formateur);
    }

   /*  @PutMapping ("/{id}/assign-participant")
    public Formation assignParticipantToFormation(
            @PathVariable int id,
            @RequestBody Participant participant_id
    ) {

        System.out.println(participant_id);
        Participant participant = ParticipantService.getParticipantById(participant_id.getId());
        return ParticipantService.addParticipantsToFormation(id, participant);
    }*/

   @PutMapping("/{formationId}/participants")
   public ResponseEntity<Formation> addParticipantsToFormation(
           @PathVariable int formationId,
           @RequestBody List<Participant> participants) {
       try {
           Formation updatedFormation = formationService.addParticipantsToFormation(formationId, participants);
           return ResponseEntity.ok(updatedFormation);
       } catch (RuntimeException e) {
           // Handle the exception, for example, return a 404 Not Found response
           return ResponseEntity.notFound().build();
       }
   }

    @DeleteMapping("/{id}")
    public void deleteFormation(@PathVariable int id) {
        formationService.deleteFormation(id);
    }

    // Define additional endpoints as needed
}
