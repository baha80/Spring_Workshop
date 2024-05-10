package com.example.firstproject.restController;

import com.example.firstproject.entities.Inscription;
import com.example.firstproject.services.IInscription;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class InscriptionRestController {
    private IInscription  inscription;

    @PostMapping("/ADDinscription")// ajouter une inscription
    public Inscription addInscription(@RequestBody Inscription sk){
        // @RequestBody annotation is used to bind the HTTP request/response body with a domain object in method parameter or return type.
        return inscription.addInscription(sk);
    }

    @PutMapping("/UPDATEinscription")// modifier une inscription
    public Inscription updateInscription(@RequestBody Inscription sk){
        return inscription.updateInscription(sk);
    }

    @GetMapping("/GETAllinscription")// afficher toutes les inscriptions
    public List<Inscription> getAllInscription(){
        return inscription.getAllInscription();
    }

    @GetMapping("/GETByIDinscription/{numsk}")// afficher une inscription par son id
    public Inscription getInscriptionById(@PathVariable Long numsk){
        return inscription.getInById(numsk);
    }

    @DeleteMapping("/DELETEinscription/{numsk}")// supprimer une inscription par son id
    public void deleteInscription(@PathVariable Long numsk){
        inscription.deleteInscription(numsk);
    }
}
