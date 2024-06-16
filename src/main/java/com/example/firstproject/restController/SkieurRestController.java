package com.example.firstproject.restController;

import com.example.firstproject.entities.Skieur;
import com.example.firstproject.entities.TypeAbonnement;
import com.example.firstproject.services.ISkieur;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class SkieurRestController {
    private ISkieur iSkieur;

    @PostMapping("/ADDskieur")// ajouter un skieur
    public Skieur addSk(@RequestBody Skieur sk){
        // @RequestBody annotation is used to bind the HTTP request/response body with a domain object in method parameter or return type.
        return iSkieur.addSkieur(sk);
    }
    @PutMapping("/UPDATEskieur")// modifier un skieur
    public Skieur updateSk(@RequestBody Skieur sk){
        return iSkieur.updateSkieur(sk);
    }
    @GetMapping("/GETAllskieur")// afficher tous les skieurs
    public List<Skieur> getAllSk(){
        return iSkieur.getAllSkieur();
    }
    @GetMapping("/GETByIDskieur/{numsk}")// afficher un skieur par son id
    public Skieur getSkById(@PathVariable Long numsk){
        return iSkieur.getSkById(numsk);
    }
    @DeleteMapping("/DELETEskieur/{numsk}")// supprimer un skieur par son id
    public void deleteSk(@PathVariable Long numsk){
        iSkieur.deleteSkieur(numsk);
    }
    @GetMapping("/getSkieurByNom/{nom}")
    public Skieur getSkByNom(@PathVariable String nom){
        return iSkieur.getSkByNom(nom);
    }
    //addInscriAndAssignToSkieur

    //AssignSkieurToPiste
    @PostMapping("/AssignSkieurToPiste/{numsk}/{numPiste}")
    public Skieur AssignSkieurToPiste(@PathVariable Long numsk, @PathVariable Long numPiste){
        return iSkieur.AssignSkieurToPiste(numsk, numPiste);
    }

    @PostMapping("/addSkieurandAssigntoCours/{numCours}")
    public Skieur addSkieurandAssigntoCours(@RequestBody Skieur skieur, @PathVariable Long numCours){
        return iSkieur.addSkieurandAssigntoCours(skieur, numCours);
    }
@GetMapping("/retrieveSkieurByTypeAbonn/{typeAbonnement}")
    public List<Skieur> retrieveSkieurByTypeAbonn(@PathVariable  TypeAbonnement typeAbonnement ){
        return iSkieur.retrieveSkieurByTypeAbonnement(typeAbonnement);
}





}
