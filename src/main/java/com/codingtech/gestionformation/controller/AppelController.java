package com.codingtech.gestionformation.controller;

import com.codingtech.gestionformation.entity.Appel;
import com.codingtech.gestionformation.service.AppelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appels")
public class AppelController {

    private final AppelService appelService;

    @Autowired
    public AppelController(AppelService appelService) {
        this.appelService = appelService;
    }

    @GetMapping("/")
    public List<Appel> getAllAppels() {
        return appelService.getAllAppels();
    }

    @GetMapping("/{id}")
    public Appel getAppelById(@PathVariable int id) {
        return appelService.getAppelById(id);
    }

    @PostMapping("/")
    public Appel saveAppel(@RequestBody Appel appel) {
        return appelService.saveAppel(appel);
    }

    @DeleteMapping("/{id}")
    public void deleteAppel(@PathVariable int id) {
        appelService.deleteAppel(id);
    }

    // Define additional endpoints as needed
}
