package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Formateur;
import com.codingtech.gestionformation.repo.FormateurRepo;
import com.codingtech.gestionformation.security.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FormateurServiceImpl implements FormateurService {

    private final FormateurRepo formateurRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public FormateurServiceImpl(FormateurRepo formateurRepository) {
        this.formateurRepository = formateurRepository;
    }

    @Override
    public List<Formateur> getAllFormateurs() {
        return formateurRepository.findAll();
    }

    @Override
    public Formateur getFormateurById(int id) {
        return formateurRepository.findById(id).orElse(null);
    }

    @Override
    public Formateur saveFormateur(Formateur formateur) {
        String hashedPassword = passwordEncoder.encode(formateur.getPassword());
        List<Role> roles=new ArrayList<>();
        roles.add(new Role(4,"FORMATEUR"));
        formateur.setPassword(hashedPassword);
        formateur.setRoles(roles);
        return formateurRepository.save(formateur);
    }

    @Override
    public void deleteFormateur(int id) {
        formateurRepository.deleteById(id);
    }

    // Define additional methods as needed
}

