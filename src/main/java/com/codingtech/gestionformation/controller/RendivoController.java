package com.codingtech.gestionformation.controller;

import com.codingtech.gestionformation.entity.Rdv;
import com.codingtech.gestionformation.service.RendivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rendivos")
public class RendivoController {

    private final RendivoService rendivoService;

    @Autowired
    public RendivoController(RendivoService rendivoService) {
        this.rendivoService = rendivoService;
    }

    @GetMapping("/")
    public List<Rdv> getAllRendivos() {
        return rendivoService.getAllRendivos();
    }

    @GetMapping("/{id}")
    public Rdv getRendivoById(@PathVariable int id) {
        return rendivoService.getRendivoById(id);
    }

    @PostMapping("/")
    public Rdv saveRendivo(@RequestBody Rdv rendivo) {
        return rendivoService.saveRendivo(rendivo);
    }

    @DeleteMapping("/{id}")
    public void deleteRendivo(@PathVariable int id) {
        rendivoService.deleteRendivo(id);
    }

    // Define additional endpoints as needed
}
