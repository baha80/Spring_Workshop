package com.example.firstproject.restController;

import com.example.firstproject.entities.Abonnement;
import com.example.firstproject.entities.TypeAbonnement;
import com.example.firstproject.services.IAbonnement;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
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


    @GetMapping("/GETByTypeAbonnement/{typeAbonnement}")// afficher un abonnement par son type
    public List<Abonnement> getAbByType(@PathVariable TypeAbonnement typeAbonnement){
        return iAbonnement.getAbonnementByType(typeAbonnement);
    }
    @GetMapping("/retrieveSubByDate/{startDate}/{endDate}")
    public List<Abonnement> retrieveSubByDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate , @PathVariable@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate){
        return iAbonnement.retrieveSubscriptionByDate(startDate, endDate);
    }

}
