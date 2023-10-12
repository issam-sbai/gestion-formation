package com.codingtech.gestionformation.controller;

import com.codingtech.gestionformation.entity.Commercial;
import com.codingtech.gestionformation.service.CommercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/commercials")
public class CommercialController {

    private final CommercialService commercialService;

    @Autowired
    public CommercialController(CommercialService commercialService) {
        this.commercialService = commercialService;
    }

    @GetMapping("/")
    public List<Commercial> getAllCommercials() {
        return commercialService.getAllCommercials();
    }

    @GetMapping("/{id}")
    public Optional<Commercial> getCommercialById(@PathVariable int id) {
        return commercialService.getCommercialById(id);
    }

    @PostMapping("/")
    public Commercial saveCommercial(@RequestBody Commercial commercial) {
        return commercialService.saveCommercial(commercial);
    }

    @DeleteMapping("/{id}")
    public void deleteCommercial(@PathVariable int id) {
        commercialService.deleteCommercial(id);
    }

    // Define additional endpoints as needed
}
