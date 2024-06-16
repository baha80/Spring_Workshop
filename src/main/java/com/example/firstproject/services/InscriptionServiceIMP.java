package com.example.firstproject.services;

import com.example.firstproject.entities.*;
import com.example.firstproject.repository.CourRepository;
import com.example.firstproject.repository.InscriptionRepository;
import com.example.firstproject.repository.SkieurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class InscriptionServiceIMP implements IInscription{
private InscriptionRepository inscriptionRepository;
private SkieurRepository skieurRepository;
private CourRepository courseRepository;
    @Override
    public Inscription addInscription(Inscription sk) {
        return inscriptionRepository.save(sk);
    }

    @Override
    public Inscription updateInscription(Inscription sk) {
        return inscriptionRepository.save(sk);
    }

    @Override
    public List<Inscription> getAllInscription() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription getInById(Long numsk) {
        return inscriptionRepository.findById(numsk).get();
    }

    @Override
    public void deleteInscription(Long numsk) {
        inscriptionRepository.deleteById(numsk);

    }

    @Override
    public Inscription addInscriAndAssignToSkieur(Inscription inscription, long numSkieur) {
        //create a new skieur object and check if it exists in the database
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        //assign the skieur to the inscription
            inscription.setSkieur(skieur);
            //save the inscription
            return inscriptionRepository.save(inscription);
    }
    //If no Skieur with the given ID is found, the Inscription is assigned to null.

    @Override
    public Inscription addInscriAndAssignToCour(Inscription inscription, long numCour) {
        Cours cour = courseRepository.findById(numCour).orElse(null);
        inscription.setCours(cour);
        return inscriptionRepository.save(inscription);

    }

    @Override
    public List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support) {
        return inscriptionRepository.numWeeksCourseOfInstructorBySupport(numInstructor , support);
    }


}
