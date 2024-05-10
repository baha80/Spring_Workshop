package com.example.firstproject.restController;

import com.example.firstproject.entities.Piste;
import com.example.firstproject.services.IPiste;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PisteRestController {

    private IPiste pisteService;

    @PostMapping("/ADDpiste")// ajouter une piste
    public Piste addPiste(@RequestBody Piste sk){
        // @RequestBody annotation is used to bind the HTTP request/response body with a domain object in method parameter or return type.
        return pisteService.addPiste(sk);
    }

    @PutMapping("/UPDATEpiste")// modifier une piste
    public Piste updatePiste(@RequestBody Piste sk){
        return pisteService.updatePiste(sk);
    }

    @GetMapping("/GETAllpiste")// afficher toutes les pistes
    public List<Piste> getAllPiste(){
        return pisteService.getAllPiste();
    }

    @GetMapping("/GETByIDpiste/{numsk}")// afficher une piste par son id
    public Piste getPisteById(@PathVariable Long numsk) {
        return pisteService.getPisteById(numsk);

    }

    @DeleteMapping("/DELETEpiste/{numsk}")// supprimer une piste par son id
    public void deletePiste(@PathVariable Long numsk){
        pisteService.deletePiste(numsk);
    }

}
