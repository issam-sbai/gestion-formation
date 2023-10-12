package com.codingtech.gestionformation.controller;


import com.codingtech.gestionformation.entity.Participant;
import com.codingtech.gestionformation.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participants")
public class ParticipantController {

    private final ParticipantService participantService;

    @Autowired
    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    @GetMapping("")
    public List<Participant> getAllParticipants() {
        return participantService.getAllParticipants();
    }

    @GetMapping("/{id}")
    public Participant getParticipantById(@PathVariable int id) {
        return participantService.getParticipantById(id);
    }

    @PostMapping("/add")
    public Participant saveParticipant(@RequestBody Participant participant) {
        return participantService.saveParticipant(participant);
    }

    @DeleteMapping("/{id}")
    public void deleteParticipant(@PathVariable int id) {
        participantService.deleteParticipant(id);
    }

    // Define additional endpoints as needed
}
