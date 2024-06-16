package com.example.firstproject.restController;

import com.example.firstproject.entities.Inscription;
import com.example.firstproject.entities.Support;
import com.example.firstproject.services.IInscription;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
public class InscriptionRestController {
    private IInscription  iinscription;

    @PostMapping("/ADDinscription")// ajouter une inscription
    public Inscription addInscription(@RequestBody Inscription sk){
        // @RequestBody annotation is used to bind the HTTP request/response body with a domain object in method parameter or return type.
        return iinscription.addInscription(sk);
    }

    @PutMapping("/UPDATEinscription")// modifier une inscription
    public Inscription updateInscription(@RequestBody Inscription sk){
        return iinscription.updateInscription(sk);
    }

    @GetMapping("/GETAllinscription")// afficher toutes les inscriptions
    public List<Inscription> getAllInscription(){
        return iinscription.getAllInscription();
    }

    @GetMapping("/GETByIDinscription/{numsk}")// afficher une inscription par son id
    public Inscription getInscriptionById(@PathVariable Long numsk){
        return iinscription.getInById(numsk);
    }

    @DeleteMapping("/DELETEinscription/{numsk}")// supprimer une inscription par son id
    public void deleteInscription(@PathVariable Long numsk){
        iinscription.deleteInscription(numsk);
    }


    @PostMapping("/addInscriAndAssignToSkieur/{numSkieur}")// ajouter une inscription et l'assigner à un skieur
    public Inscription addInscriAndAssignToSkieur(@RequestBody Inscription inscription, @PathVariable long numSkieur){
        return iinscription.addInscriAndAssignToSkieur(inscription, numSkieur);
    }
    @PostMapping("/addInscriAndAssignToCour/{numCour}")// ajouter une inscription et l'assigner à un cours
    public Inscription addInscriAndAssignToCour(@RequestBody Inscription inscription, @PathVariable long numCour){
        return iinscription.addInscriAndAssignToCour(inscription, numCour);
    }

    @GetMapping("/numWeeksCourseOfInstructorBySupport/{numInstructor}/{support}")
    public List<Integer> numWeeksCourseOfInstructorBySupport(@PathVariable Long numInstructor, @PathVariable Support support){
        return  iinscription.numWeeksCourseOfInstructorBySupport(numInstructor,support);
    }

}
