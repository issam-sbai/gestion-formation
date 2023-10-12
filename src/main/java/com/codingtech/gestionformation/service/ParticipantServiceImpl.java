package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Participant;
import com.codingtech.gestionformation.repo.ParticipantRepo;
import com.codingtech.gestionformation.security.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParticipantServiceImpl implements ParticipantService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    private final ParticipantRepo participantRepository;

    @Autowired
    public ParticipantServiceImpl(ParticipantRepo participantRepository) {
        this.participantRepository = participantRepository;
    }

    @Override
    public List<Participant> getAllParticipants() {
        return participantRepository.findAll();
    }

    @Override
    public Participant getParticipantById(int id) {
        return participantRepository.findById(id).orElse(null);
    }

    @Override
    public Participant saveParticipant(Participant participant) {

        String hashedPassword = passwordEncoder.encode(participant.getPassword());
        List<Role> roles=new ArrayList<>();
        roles.add(new Role(3,"PARTICIPANT"));
        participant.setPassword(hashedPassword);
        participant.setRoles(roles);
        return participantRepository.save(participant);
    }

    @Override
    public void deleteParticipant(int id) {
        participantRepository.deleteById(id);
    }

    // Define additional methods as needed
}
