package com.example.firstproject.restController;

import com.example.firstproject.entities.Moniteur;
import com.example.firstproject.services.IMoniteur;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class MoniteurRestController {

    private IMoniteur moniteurService;

    @PostMapping("/ADDmoniteur")// ajouter un moniteur
    public Moniteur addMoniteur(@RequestBody Moniteur sk){
        // @RequestBody annotation is used to bind the HTTP request/response body with a domain object in method parameter or return type.
        return moniteurService.addMoniteur(sk);
    }

    @PutMapping("/UPDATEmoniteur")// modifier un moniteur
    public Moniteur updateMoniteur(@RequestBody Moniteur sk){
        return moniteurService.updateMoniteur(sk);
    }

    @GetMapping("/GETAllmoniteur")// afficher tous les moniteurs
    public List<Moniteur> getAllMoniteur(){
        return moniteurService.getAllMoniteur();
    }

    @GetMapping("/GETByIDmoniteur/{numsk}")// afficher un moniteur par son id
    public Moniteur getMoniteurById(@PathVariable Long numsk){
        return moniteurService.getMoniteurById(numsk);
    }

    @DeleteMapping("/DELETEmoniteur/{numsk}")// supprimer un moniteur par son id
    public void deleteMoniteur(@PathVariable Long numsk){
        moniteurService.deleteMoniteur(numsk);
    }
}
