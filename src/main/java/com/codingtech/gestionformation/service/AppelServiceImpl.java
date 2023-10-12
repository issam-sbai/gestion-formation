package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Appel;
import com.codingtech.gestionformation.repo.AppelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppelServiceImpl implements AppelService {

    private final AppelRepo appelRepository;

    @Autowired
    public AppelServiceImpl(AppelRepo appelRepository) {
        this.appelRepository = appelRepository;
    }

    @Override
    public List<Appel> getAllAppels() {
        return appelRepository.findAll();
    }

    @Override
    public Appel getAppelById(int id) {
        return appelRepository.findById(id).orElse(null);
    }

    @Override
    public Appel saveAppel(Appel appel) {
        return appelRepository.save(appel);
    }

    @Override
    public void deleteAppel(int id) {
        appelRepository.deleteById(id);
    }

    // Define additional methods as needed
}

