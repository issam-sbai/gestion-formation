package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Participant;

import java.util.List;

public interface ParticipantService {
    List<Participant> getAllParticipants();

    Participant getParticipantById(int id);

    Participant saveParticipant(Participant participant);

    void deleteParticipant(int id);
}
