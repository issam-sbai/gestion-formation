package com.codingtech.gestionformation.controller;

import com.codingtech.gestionformation.entity.Formateur;
import com.codingtech.gestionformation.security.entity.Role;
import com.codingtech.gestionformation.service.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/formateurs")
public class FormateurController {

    private final FormateurService formateurService;



    @Autowired
    public FormateurController(FormateurService formateurService) {
        this.formateurService = formateurService;
    }

    @GetMapping("")
    public List<Formateur> getAllFormateurs() {
        return formateurService.getAllFormateurs();
    }

    @GetMapping("/{id}")
    public Formateur getFormateurById(@PathVariable int id) {
        return formateurService.getFormateurById(id);
    }

    @PostMapping("/add")
    public Formateur saveFormateur(@RequestBody Formateur formateur) {
        return formateurService.saveFormateur(formateur);
    }



    @DeleteMapping("/{id}")
    public void deleteFormateur(@PathVariable int id) {
        formateurService.deleteFormateur(id);
    }

    // Define additional endpoints as needed
}
