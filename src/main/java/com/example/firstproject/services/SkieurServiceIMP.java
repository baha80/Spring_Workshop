package com.example.firstproject.services;

import com.example.firstproject.entities.*;
import com.example.firstproject.repository.CourRepository;
import com.example.firstproject.repository.InscriptionRepository;
import com.example.firstproject.repository.PisteRepository;
import com.example.firstproject.repository.SkieurRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
@Slf4j
@AllArgsConstructor
//@Autowired // injection par champs
@Service  // @Service annotation is used with classes that provide some business functionalities.
public class SkieurServiceIMP implements ISkieur{

    private SkieurRepository skieurRepository; //service d'implementation depend de la couche repository

    private PisteRepository pisteRepository; //service d'implementation depend de la couche repository

    private InscriptionRepository inscriptionRepository;

    private CourRepository CourRepository;


    @Override
    public Skieur addSkieur(Skieur sk) {
       return skieurRepository.save(sk); //save() method saves an entity to the database
    }

    @Override
    public Skieur updateSkieur(Skieur sk) {
        return skieurRepository.save(sk);// save()
    }

    @Override
    public List<Skieur> getAllSkieur() {
        return skieurRepository.findAll(); //findAll() method returns all entities from the database.
    }

    @Override
    public Skieur getSkById(Long numsk) {
        //return skieurRepository.findById(numsk).get(); //findById() method finds an entity by its primary key.
        //.get() method returns the value of this Optional if present, otherwise throws NoSuchElementException.
        return skieurRepository.findById(numsk).orElse(null);
    }

    @Override
    public void deleteSkieur(Long numsk) {
        skieurRepository.deleteById(numsk); //deleteById() method deletes an entity by its primary key.

    }

    @Override
    public Skieur getSkByNom(String nom) {
        return skieurRepository.findByNomSk(nom);
    }

    @Override //ToBeChecked
    public Skieur AssignSkieurToPiste(Long numsk, Long numPiste) {
        Skieur skieur = skieurRepository.findById(numsk).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        try {
            skieur.getPistes().add(piste); //add piste to the list of piste
        } catch (NullPointerException e) {
            //initilaise la liste des pistes
            Set<Piste> pisteSet = new HashSet<Piste>();
            pisteSet.add(piste);
            skieur.setPistes(pisteSet);
        }
        //catch because the list of piste is null so we need to initialise it first before adding a piste to it
        //many to one relation SET inscrit a un seul skieur
        //many to many relation .get.add  get liste piste et add piste
        return skieurRepository.save(skieur);
    }

    @Override //ToBeChecked
    public Skieur addSkieurandAssigntoCours(Skieur skieur, Long numCours) {
        Skieur savedSkieur = skieurRepository.save(skieur);
        Cours cours = CourRepository.findById(numCours).orElse(null);
        Set<Inscription> inscriptions = savedSkieur.getInscriptions();
        for (Inscription inscription : inscriptions) {
            inscription.setCours(cours);
            inscription.setSkieur(savedSkieur);
            inscriptionRepository.save(inscription);
        }
        return skieurRepository.save(skieur);
    }

    @Override
    public List<Skieur> retrieveSkieurByTypeAbonnement(TypeAbonnement typeAbonnement) {
        return skieurRepository.findByAbonnement_TypeAbon(typeAbonnement) ;
    }


    @Scheduled(fixedRate = 60000)
    public void fixedRateMethod() {
        log.info("Skieur");
    }

    @Scheduled(fixedDelay = 60000)
    public void fixedDelayMethod() {
        log.info("Method with fixed delay");
    }


}
