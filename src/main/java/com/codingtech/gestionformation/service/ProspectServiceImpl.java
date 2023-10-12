package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Prospect;
import com.codingtech.gestionformation.repo.ProspectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProspectServiceImpl implements ProspectService {

    private final ProspectRepo formationRepository;

    @Autowired
    public ProspectServiceImpl(ProspectRepo formationRepository) {
        this.formationRepository = formationRepository;
    }

    @Override
    public List<Prospect> getAllFormations() {
        return formationRepository.findAll();
    }

    @Override
    public Prospect getFormationById(int id) {
        return formationRepository.findById(id).orElse(null);
    }

    @Override
    public Prospect saveFormation(Prospect formation) {
        return formationRepository.save(formation);
    }

    @Override
    public void deleteFormation(int id) {
        formationRepository.deleteById(id);
    }

    // Define additional methods as needed
}
