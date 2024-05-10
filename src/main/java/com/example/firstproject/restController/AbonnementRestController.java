package com.example.firstproject.restController;

import com.example.firstproject.entities.Abonnement;
import com.example.firstproject.services.IAbonnement;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class AbonnementRestController {

    private IAbonnement iAbonnement;

    @PostMapping("/ADDabonnement")// ajouter un abonnement
    public Abonnement addAb(@RequestBody Abonnement sk){
        // @RequestBody annotation is used to bind the HTTP request/response body with a domain object in method parameter or return type.
        return iAbonnement.addAbonnement(sk);
    }

    @PutMapping("/UPDATEabonnement")// modifier un abonnement
    public Abonnement updateAb(@RequestBody Abonnement sk){
        return iAbonnement.updateAbonnement(sk);
    }

    @GetMapping ("/GETAllabonnement")// afficher tous les abonnements
    public List<Abonnement> getAllAb(){
        return iAbonnement.getAllAbonnement();
    }

    @GetMapping("/GETByIDabonnement/{numsk}")// afficher un abonnement par son id
    public Abonnement getAbById(@PathVariable Long numsk){
        return iAbonnement.getAbonnementById(numsk);
    }

    @DeleteMapping("/DELETEabonnement/{numsk}")// supprimer un abonnement par son id
    public void deleteAb(@PathVariable Long numsk){
        iAbonnement.deleteAbonnement(numsk);
    }

}
